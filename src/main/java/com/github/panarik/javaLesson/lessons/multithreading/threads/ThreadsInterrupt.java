package com.github.panarik.javaLesson.lessons.multithreading.threads;

public class ThreadsInterrupt {

    public static void main(String[] args) throws InterruptedException {

        // первый вариант. Поток - демон.
        // Этот поток фоновый, его не жалко.
        // поток-демон. Его никто не останавливает, он умирает вместе с JVM.
        // Почему программа завершается:
        // - Правило JVM: программа живёт, пока жив хотя бы один обычный (не демон) поток. Демоны не в счёт.
        // - Когда main закончился, обычных потоков не осталось, и JVM завершается:
        //     - убивает демона на полуслове.
        //     - Ни catch, ни finally у него не выполнятся.
        daemon();

        // Второй вариант
        // Обычный поток, останавливаем через interrupt().
        // Поток сам проверяет флаг прерывания и корректно выходит из цикла.
        // regularThread();

    }

    private static void regularThread() {

        Thread t = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Tick");
                    Thread.sleep(500);
                    System.out.println("Tack");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("всё ок");
        }
        t.interrupt();
        System.out.println("Finished");
    }

    private static void daemon() throws InterruptedException {

        Thread t = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Tick");
                    Thread.sleep(500);
                    System.out.println("Tack");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true); // можно попробовать убрать и посмотреть что будет.
        t.start();
        Thread.sleep(5000);
        System.out.println("Finished");
    }

}
