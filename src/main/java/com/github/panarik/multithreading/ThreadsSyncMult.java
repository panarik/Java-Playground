package com.github.panarik.multithreading;

public class ThreadsSyncMult {

    //создаём мониторы
    private static Object mon1 = new Object();
    private static Object mon2 = new Object();

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

        //запускаем синхронизированный поток (монитор1)
        td.start();

        //запускаем еще синхронизированные потоки (монитор2)
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);


    }

    private static void increment() {
        synchronized (mon1) {
            a++;
            b++;
            c++;
        }

    }

    private static void doSomething() {
        try {
            synchronized (mon2) {
                System.out.println("Начали");
                Thread.sleep(5000);
                System.out.println("Закончили");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
