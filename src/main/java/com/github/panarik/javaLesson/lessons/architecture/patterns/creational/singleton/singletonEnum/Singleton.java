package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.singleton.singletonEnum;

public enum Singleton {

    INSTANCE;

    public void doWork(){
        System.out.println("Do some work from singleton.");
    }

}
