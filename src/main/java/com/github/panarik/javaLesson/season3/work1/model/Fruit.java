package com.github.panarik.javaLesson.season3.work1.model;

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
