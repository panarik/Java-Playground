package com.github.panarik.javaLesson.lessons.multithreading.threads;

public class ThreadsSyncMult {

    //создаём мониторы
    private static final Object MON_1 = new Object();
    private static final Object MON_2 = new Object();

    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

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

        //запускаем синхронизированные потоки (монитор1)
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

        //запускаем синхронизированный поток (монитор2)
        td.start();


    }
    private static void increment() {
        synchronized (MON_1) {
            a++;
            b++;
            c++;
        }

    }

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
