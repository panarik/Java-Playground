package com.github.panarik.javaLesson.season3.work1.model;

import java.util.ArrayList;
import java.util.Collections;

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
            this.fruits.add(fruit);
    }

    public ArrayList<F> viewFruits() {
        return fruits;
    }

    public float getWeightFruits() {
        float sum = 0;
        for (F fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box) {
        return this.getWeightFruits() == box.getWeightFruits();
    }


    public void shiftTo(Box<F> box){
        box.fruits.addAll(fruits);
        this.fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
