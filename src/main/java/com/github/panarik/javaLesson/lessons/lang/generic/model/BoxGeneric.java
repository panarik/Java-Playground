package com.github.panarik.javaLesson.lessons.lang.generic.model;

//public class GenericBox<T, R, Q> {
public class BoxGeneric<T> {

    //нельзя сделать static
    private T item;

    public BoxGeneric(T type) {
        this.item = type;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
