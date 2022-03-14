package com.github.panarik.javaLesson.work.season1.work1.model;

public abstract class Fruit {
    protected float weight;
    private String type = "Fruit";

    public Fruit(float weight){
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public float getWeight(){
        return weight;
    }


}
