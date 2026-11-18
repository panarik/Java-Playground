package com.github.panarik.javaLesson.lessons.multithreading.threads;

public class ThreadsCreate {

    public static void main(String[] args) {

        // Мейн - это тоже поток.
        System.out.printf("Hello from com.github.panarik.javaLesson.work.leetcode.Main. Thread is [%s]\n", Thread.currentThread().getName());

        //первый вариант. Напрямую через создание потока.
        Thread myThread = new MyThread();
        myThread.start();

        // второй вариант. Через использование интерфейса.
        // Более гибкий вариант.
        MyRunnable mr = new MyRunnable();
        Thread myRunnable = new Thread(mr);
        myRunnable.start();

        // третий вариант
        new Thread(new MyRunnable()).start();

        // четвертый вариант + имя потока.
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("ANONYMOUS");
                System.out.printf("Hello from Anonymous. Thread is [%s]\n", Thread.currentThread().getName());
            }
        }).start();

        // Пятый вариант. Так как интерфейс имеет только один метод то его можно заменить лямбдой.
        Thread t5 = new Thread(() -> System.out.println("Hello lambda " + Thread.currentThread().getName()));
        t5.start();

        // тред с именем
        new MyThread("myThread").start();


        // Ожидание потока с таймаутом.
        // myThread спит 5с. main ждёт его максимум 1с и идёт дальше.
        // join НЕ останавливает myThread — он продолжает работать.
        try {
            myThread.join(1000);
            System.out.println("Thread has been finished: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main was waiting myThread for 1s");


        // Ожидание без таймаута: main ждёт, пока оба потока полностью завершатся.
        // myThread доспит оставшиеся ~4с, myRunnable уже завершён — join вернётся сразу.
        try {
            myThread.join();
            myRunnable.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread myThread and myRunnable has finished without join time set");


    }

    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        public MyThread() {
        }

        @Override
        public void run() {
            // пауза 5сек
            try {
                Thread.sleep(5000);
                System.out.println("Thread has been finished: " + Thread.currentThread().getName());
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
