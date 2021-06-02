package com.github.panarik.lang.oop.interfaces;

public class Dug implements Flyable {

    String name;

    Dug(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.printf("%s утка летает\n", name);
    }
}
