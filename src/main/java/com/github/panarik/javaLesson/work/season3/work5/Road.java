package com.github.panarik.javaLesson.work.season3.work5;

public class Road extends Stage {
    public Road(int length) {
        this.length = length;
        this.description = "Road " + length + " meters";
    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " start this stage: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " has finished this stage: " + description);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
