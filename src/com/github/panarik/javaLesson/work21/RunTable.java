package com.github.panarik.javaLesson.work21;

public class RunTable implements Running {
    private int distance;

    public RunTable(int distance) {
        this.distance = distance;
    }

    @Override
    public void run() {
        System.out.println("Бежит по беговой дорожке");
    }
}
