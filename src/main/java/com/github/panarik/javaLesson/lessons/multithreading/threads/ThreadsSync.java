package com.github.panarik.javaLesson.lessons.multithreading.threads;

// Синхронизация потоков.
// Три потока одновременно увеличивают общие счётчики a, b, c.
// a++ — это не одна операция (прочитать → прибавить → записать),
// поэтому без synchronized потоки «затирают» изменения друг друга
// и итог получается меньше 3000 (гонка данных, race condition).
public class ThreadsSync {

    // Общие данные для всех потоков
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    // Запускает 3 потока по 1000 инкрементов, ждёт их через join() и печатает итог.
    // Ожидаемый результат: a = 3000, b = 3000, c = 3000.
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

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.printf("a = %d, b = %d, c = %d", a,b,c);
    }


    // synchronized: в метод одновременно может войти только один поток.
    // Метод static, поэтому замок — объект ThreadsSync.class.
    private static synchronized void increment() {
        a++;
        b++;
        c++;
    }

}
