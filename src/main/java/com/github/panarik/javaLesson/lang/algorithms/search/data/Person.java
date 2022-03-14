package com.github.panarik.javaLesson.lang.algorithms.search.data;

import java.util.LinkedList;

public class Person {

    public String name;
    public LinkedList<String> friends;
    public boolean isWorking;
    public boolean checked;

    public Person(String name, LinkedList<String> friends, boolean isWorking, boolean checked) {
        this.name = name;
        this.friends = friends;
        this.isWorking = isWorking;
        this.checked = checked;
    }

    public Person(String you, LinkedList<String> friends) {
    }
}
