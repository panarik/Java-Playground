package com.github.panarik.javaLesson.work.season3.work5;

public class Tunnel extends Stage {
    public Tunnel() {
        this.length = 80;
        this.description = "Tunnel " + length + " meters";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " prepare for stage (waiting): " + description);
                System.out.println(c.getName() + " start this stage: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " has finished this stage: " + description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
