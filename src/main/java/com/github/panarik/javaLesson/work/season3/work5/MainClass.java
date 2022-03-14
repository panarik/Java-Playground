package com.github.panarik.javaLesson.work.season3.work5;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MainClass {

    public static final int CARS_COUNT = 4;
    private static int carsReadyForRace = 0;
    private static ReentrantReadWriteLock stagePrepare;

    public static void addReadyForRace() {
        carsReadyForRace++;
    }

    public static boolean isStartRace() {
        return !stagePrepare.isWriteLocked();
    }

    public static void main(String[] args) {

        //ЭТАП 1: ПОДГОТОВКА
        System.out.println("ATTENTION >>> PREPARE FOR RACE!!!");

        //создаем трассу и машины
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        //наделяем машины свойствами
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        //запускаем потоки с машинами для подготовки к гонке
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        //ждем пока машины приготовятся
        //блокируем старт пока на приготовятся
        stagePrepare = new ReentrantReadWriteLock();
        stagePrepare.writeLock().lock();
        //пока тупо ждем и даём отмашку в слепую
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //ЭТАП 2: гонка
        System.out.println("ATTENTION >>> RACE START!!!");
        stagePrepare.writeLock().unlock();




        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //ЭТАП 3: ФИНИШ
        System.out.println("ATTENTION >>> RACE FINISHED!!!");
    }
}






