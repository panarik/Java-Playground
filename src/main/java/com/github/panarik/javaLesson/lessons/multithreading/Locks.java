package com.github.panarik.javaLesson.lessons.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Locks {

    String description = "empty";

    public static void main(String[] args) {

        //simpleLock();
        //tryLock();
        new Locks().reentrantReadWriteLock();




    }

    private void reentrantReadWriteLock() {

        ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();

        //1ый поток - читает
        new Thread(()-> {
            try {
                rrwl.readLock().lock();
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
            try {
                rrwl.readLock().lock();
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
            try {
                rrwl.readLock().lock();
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
            try {
                rrwl.writeLock().lock();
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
            try {
                rrwl.readLock().lock();
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
            try {
                rrwl.writeLock().lock();
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

    private static void tryLock() {
        Lock lock = new ReentrantLock();
        //1ый поток
        new Thread(() -> {
            System.out.println("Before lock 1");
            try {
                lock.lock();
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

    private static void simpleLock() {
        //1. Один замок на два потока.
        Lock lock = new ReentrantLock();
        //1ый поток
        new Thread(() -> {
            System.out.println("Before lock 1");
            try {
                lock.lock();
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
            try {
                lock.lock();
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
