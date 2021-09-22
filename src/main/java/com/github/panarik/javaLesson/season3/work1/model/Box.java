package com.github.panarik.javaLesson.season3.work1.model;

import java.util.ArrayList;

public class Box<F extends Fruit> {

    private ArrayList<F> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(F fruit) {
        this.fruits = new ArrayList<>();
        this.fruits.add(fruit);
    }

    public void addFruit(F fruit) {
        if (fruit instanceof Apple) {
            for (F f : fruits) {
                if (f instanceof Orange) {
                    System.out.println("Apple нельзя положить, т.к. уже есть Orange");
                    return;
                }
            }
            this.fruits.add(fruit);
        }
        if (fruit instanceof Orange) {
            for (F f : fruits) {
                if (f instanceof Apple) {
                    System.out.println("Orange нельзя положить, т.к. уже есть Apple");
                    return;
                }
            }
            this.fruits.add(fruit);
        }
    }

    public ArrayList<F> viewFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
