package com.github.panarik.javaLesson.lessons.lang.generic.model;

public class Box {

    private Object object;

    public Box(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
