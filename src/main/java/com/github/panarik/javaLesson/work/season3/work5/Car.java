package com.github.panarik.javaLesson.work.season3.work5;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    private boolean readyForRace = false;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

    public boolean getReadyStatus(){
        return this.readyForRace;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "car #" + CARS_COUNT;
        this.readyForRace = false;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " prepare...");
            Thread.sleep(500 + (int)(Math.random() * 800));
            this.readyForRace = true; //статус готовности к рейсу
            MainClass.addReadyForRace(); //машина добавляется в список готовых к рейсу
            System.out.println(this.name + " ready!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //проверяем дан ли старт на гонку
        while (!MainClass.isStartRace()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //старт гонки
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
    }
}
