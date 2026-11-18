package com.github.panarik.javaLesson.lessons.multithreading.threads;

// Синхронизация на отдельных объектах-мониторах (synchronized-блоки).
// Вместо synchronized на весь метод замком служит свой объект: MON_1 или MON_2.
// Потоки, занявшие разные мониторы, друг друга НЕ блокируют —
// так можно защищать независимые данные разными замками.
public class ThreadsSyncMult {

    //создаём мониторы. final — чтобы замок нельзя было подменить
    private static final Object MON_1 = new Object();
    private static final Object MON_2 = new Object();

    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    // Поток td занимает MON_2 на 5с, а в это же время 3 потока инкрементируют
    // счётчики под MON_1 (итог 3000) — и не ждут td, потому что замки разные.
    public static void main(String[] args) throws InterruptedException {


        //первый поток
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        //второй поток
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        //третий поток
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        Thread td = new Thread(ThreadsSyncMult::doSomething);

        //запускаем поток с монитором2 ПЕРВЫМ: он займёт MON_2 и уснёт на 5с
        td.start();

        //запускаем синхронизированные потоки (монитор1).
        //td держит MON_2, но потокам с MON_1 это не мешает — замки разные
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        //печатается сразу, пока td ещё спит: "a = 3000..." появится между "Start" и "Stop".
        //Если бы increment() тоже синхронизировался на MON_2, счёт ждал бы 5с, пока td отпустит замок
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }

    // Синхронизирован только блок, а не весь метод. Замок — MON_1.
    private static void increment() {
        synchronized (MON_1) {
            a++;
            b++;
            c++;
        }

    }

    // Держит MON_2 5 секунд. На потоки с MON_1 это не влияет — у них другой замок.
    private static void doSomething() {
        try {
            synchronized (MON_2) {
                System.out.println("Start");
                Thread.sleep(5000);
                System.out.println("Stop");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
