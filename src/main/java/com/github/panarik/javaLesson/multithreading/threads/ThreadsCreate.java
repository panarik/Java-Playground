package com.github.panarik.javaLesson.multithreading.threads;

public class ThreadsCreate {

    public static void main(String[] args) {
        System.out.printf("Hello from Main. Thread is [%s]\n", Thread.currentThread().getName());

        //первый вариант
        Thread myThread = new MyThread();
        myThread.start();

        //второй вариант
        MyRunnable mr = new MyRunnable();
        Thread myRunnable = new Thread(mr);
        myRunnable.start();

        //третий вариант
        new Thread(new MyRunnable()).start();

        //четвертый вариант + имя потока
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("ANONYMOUS");
                System.out.printf("Hello from Anonymous. Thread is [%s]\n", Thread.currentThread().getName());
            }
        }).start();

        //пятый вариант - лямбда
        Thread t5 = new Thread(() -> System.out.println("Hello lambda " + Thread.currentThread().getName()));
        t5.start();

        //тред с именем
        new MyThread("myThread").start();

        //ждем макс 1сек завершения потока
        try {
            myThread.join(1000);
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Waiting myThread for 1s");


        //ждем завершения потоков
        try {
            myThread.join();
            myRunnable.join();
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread myThread and myRunnable has finished");




    }

    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        public MyThread(){
        }

        @Override
        public void run() {
            // пауза 5сек
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Hello from MyThread. Thread is [%s]\n", Thread.currentThread().getName());
        }
    }


    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.printf("Hello from MyRunnable. Thread is [%s]\n", Thread.currentThread().getName());
        }
    }

}
