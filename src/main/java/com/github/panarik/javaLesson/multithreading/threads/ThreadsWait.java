package com.github.panarik.javaLesson.multithreading.threads;

public class ThreadsWait {

    private final Object monitor = new Object();
    private char letter = 'Q';

    public static void main(String[] args) {

        ThreadsWait threadsWait = new ThreadsWait();

        new Thread(() -> threadsWait.printQ()).start();
        new Thread(() -> threadsWait.printR()).start();
    }

    private void printQ() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'Q') {
                        monitor.wait();
                    }
                    System.out.println(letter);
                    letter = 'R';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printR() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'R') {
                        monitor.wait();
                    }
                    System.out.println(letter);
                    letter = 'Q';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
