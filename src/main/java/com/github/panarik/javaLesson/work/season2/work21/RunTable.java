package com.github.panarik.javaLesson.work.season2.work21;

public class RunTable implements Running {
    private int distance;

    public RunTable(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void run(int distanceKiloMeters) {
        System.out.println("Бежит по беговой дорожке");
    }

    public static void runOnTable(int distanceKiloMeters){
        System.out.printf("бежит по беговой дорожке на дистацию %s км.\n", distanceKiloMeters);
    }

}
