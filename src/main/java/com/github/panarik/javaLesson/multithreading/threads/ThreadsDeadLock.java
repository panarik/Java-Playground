package com.github.panarik.javaLesson.multithreading.threads;

public class ThreadsDeadLock {


    private static Object mon1 = new Object();
    private static Object mon2 = new Object();

    public static void main(String[] args) {

        new Thread(ThreadsDeadLock::doA).start();
        new Thread(ThreadsDeadLock::doB).start();

    }

    private static void doA() {
        try {
            synchronized (mon1) {
                System.out.println("Do AAA");
                Thread.sleep(2000);
                doB();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void doB() {
        try {
            synchronized (mon2) {
                System.out.println("Do BBB");
                Thread.sleep(2000);
                doA();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
