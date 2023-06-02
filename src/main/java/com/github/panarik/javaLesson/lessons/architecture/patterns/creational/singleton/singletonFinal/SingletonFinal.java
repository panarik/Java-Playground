package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.singleton.singletonFinal;

public class SingletonFinal {

    private static final SingletonFinal INSTANCE = new SingletonFinal();
    private String data;

    private SingletonFinal() {
    }

    public static synchronized SingletonFinal getInstance() {
        return INSTANCE;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

}
