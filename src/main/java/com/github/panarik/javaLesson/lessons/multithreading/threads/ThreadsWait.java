package com.github.panarik.javaLesson.lessons.multithreading.threads;

// Взаимодействие потоков через wait() / notifyAll().
// Два потока печатают по очереди: Q R Q R ... (по 5 раз каждый).
// wait() — отпустить монитор и уснуть, пока кто-то не вызовет notify/notifyAll.
// notifyAll() — разбудить всех, кто ждёт на этом мониторе.
// Оба метода вызываются только внутри synchronized по тому же монитору.
public class ThreadsWait {

    // Общий монитор, на котором потоки ждут и будят друг друга
    private final Object monitor = new Object();

    // Чья сейчас очередь печатать: 'Q' или 'R'
    private char letter = 'Q';

    // Запускает два потока: один печатает Q, другой R.
    public static void main(String[] args) {

        ThreadsWait threadsWait = new ThreadsWait();

        new Thread(() -> threadsWait.printQ()).start();
        new Thread(() -> threadsWait.printR()).start();
    }

    // Ждёт своей очереди ('Q'), печатает, передаёт ход R и будит его.
    // while, а не if: после пробуждения условие надо проверить заново
    // (поток мог проснуться «ложно» или очередь ещё не его).
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

    // Зеркально printQ: ждёт 'R', печатает, передаёт ход Q и будит его.
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
