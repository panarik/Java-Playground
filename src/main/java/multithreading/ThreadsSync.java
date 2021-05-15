package multithreading;

import season1.work6.Main;

public class ThreadsSync {

    static int a = 0;
    static int b = 0;
    static int c = 0;

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


    private static synchronized void increment() {
        a++;
        b++;
        c++;
    }

}
