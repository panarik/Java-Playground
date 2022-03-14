package com.github.panarik.javaLesson.lessons.algorithms.search.data;

import java.util.LinkedList;

public class Person {

    public String name;
    public LinkedList<String> friends;
    public boolean isWorking; //this person works or not.
    public boolean checked; //this person already checked by search machine or not.

    public Person(String name, LinkedList<String> friends, boolean isWorking, boolean checked) {
        this.name = name;
        this.friends = friends;
        this.isWorking = isWorking;
        this.checked = checked;
    }

    public Person(String you, LinkedList<String> friends) {
    }
}
