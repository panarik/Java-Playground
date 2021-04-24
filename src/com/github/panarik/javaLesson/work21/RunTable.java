package com.github.panarik.javaLesson.work21;

public class RunTable implements Running {
    private int distance;

    public RunTable(int distance) {
        this.distance = distance;
    }

    @Override
    public void run(int distanceKiloMeters) {
        System.out.println("Бежит по беговой дорожке");
    }

    public static void runOnTable(int distanceKiloMeters){
        System.out.printf("бежит по беговой дорожке на дистацию %s км.\n", distanceKiloMeters);
    }

}
