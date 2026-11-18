package com.github.panarik.javaLesson.lessons.lang.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class LinkedlistExample {

    public static void main(String[] args) {


        LinkedList<String> linked = new LinkedList<>();

        linked.addFirst("One");
        linked.addFirst("Two");
        linked.addFirst("Three");
        linked.addFirst("Four");
        System.out.println(linked);
        System.out.println("Get first: " + linked.pop());
        System.out.println(linked);


    }

}
