package com.github.panarik.javaLesson.lessons.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Явные замки из java.util.concurrent.locks — альтернатива synchronized.
// Lock нужно захватывать (lock) и ОБЯЗАТЕЛЬНО отпускать (unlock) в finally.
// Шаблон: lock() — на строку ВЫШЕ try, а не внутри:
//     lock.lock();
//     try { ... } finally { lock.unlock(); }
// Если lock() внутри try и захват не удался (исключение), finally всё равно
// вызовет unlock() у замка, которым поток не владеет → IllegalMonitorStateException,
// и это исключение скроет настоящую причину ошибки.
// Зато есть возможности, которых нет у synchronized:
// попытка захвата без ожидания (tryLock) и раздельные замки на чтение/запись.
public class Locks {

    // Общие данные, которые читают и меняют потоки в reentrantReadWriteLock()
    String description = "empty";

    // Раскомментируйте нужный пример
    public static void main(String[] args) {

        // simpleLock();
        //tryLock();
        new Locks().reentrantReadWriteLock();




    }

    // ReadWriteLock: читать могут сразу несколько потоков,
    // а писать — только один, и в это время никто не читает.
    // Обычно читатели 1–3 работают одновременно, а писатель ждёт, пока они отпустят readLock
    // (точный порядок захвата не гарантирован).
    private void reentrantReadWriteLock() {

        ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();

        //1ый поток - читает
        new Thread(()-> {
            rrwl.readLock().lock(); // захват ДО try (см. комментарий к классу)
            try {
                System.out.println("Start READ 1. Value is = "+ description);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finished READ 1");
                rrwl.readLock().unlock();
            }
        }).start();

        //2ый поток - читает
        new Thread(()-> {
            rrwl.readLock().lock(); // захват ДО try (см. комментарий к классу)
            try {
                System.out.println("Start READ 2. Value is = "+description);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finished READ 2");
                rrwl.readLock().unlock();
            }
        }).start();

        //3ий поток - читает
        new Thread(()-> {
            rrwl.readLock().lock(); // захват ДО try (см. комментарий к классу)
            try {
                System.out.println("Start READ 3. Value is = "+description);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finished READ 3");
                rrwl.readLock().unlock();
            }
        }).start();

        //4ый поток - пишет
        new Thread(()-> {
            rrwl.writeLock().lock(); // захват ДО try (см. комментарий к классу)
            try {
                description = "со второго потока";
                System.out.println("Start WRITE 4. Value changed. Value is"+description);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finished WRITE 4");
                rrwl.writeLock().unlock();
            }
        }).start();

        //5ый поток - читает
        new Thread(()-> {
            rrwl.readLock().lock(); // захват ДО try (см. комментарий к классу)
            try {
                System.out.println("Start READ 5. Value is = "+description);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finished READ 5");
                rrwl.readLock().unlock();
            }
        }).start();

        //6ой поток - пишет
        new Thread(()-> {
            rrwl.writeLock().lock(); // захват ДО try (см. комментарий к классу)
            try {
                description = "из шестого потока";
                System.out.println("Start WRITE 6. Value is = "+description);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finished WRITE 6");
                rrwl.writeLock().unlock();
            }
        }).start();
    }

    // tryLock(): попытаться взять замок и сразу вернуть true/false, не ожидая.
    // Если замок занят, поток 2 не блокируется, а делает что-то другое.
    private static void tryLock() {
        Lock lock = new ReentrantLock();
        //1ый поток
        new Thread(() -> {
            System.out.println("Before lock 1");
            lock.lock(); // захват ДО try (см. комментарий к классу)
            try {
                System.out.println("Lock 1 got");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("Lock 1 released");
            }
        }).start();

        //2ой поток пытается занять
        new Thread(() -> {
            System.out.println("Before lock 2");
            //проверяем свободен ли замок
            if (lock.tryLock()) {
                try {
                    System.out.println("Lock 2 got");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                    System.out.println("Lock 2 released");
                }
            } else System.out.println("From 2 lock: Lock 1 is busy. Do something else");
        }).start();
    }

    // lock(): аналог synchronized. Второй поток ждёт, пока первый отпустит замок.
    private static void simpleLock() {

        //1. Один замок на два потока.
        Lock lock = new ReentrantLock();
        //1ый поток
        new Thread(() -> {
            System.out.println("Before lock 1");
            lock.lock(); // захват ДО try (см. комментарий к классу)
            try {
                ///
                System.out.println("Lock 1 got");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("Lock 1 released");
            }
        }).start();

        //2ой поток
        new Thread(() -> {
            System.out.println("Before lock 2");
            lock.lock(); // захват ДО try (см. комментарий к классу)
            try {
                ///
                System.out.println("Lock 2 got");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("Lock 2 released");
            }
        }).start();
    }

}
