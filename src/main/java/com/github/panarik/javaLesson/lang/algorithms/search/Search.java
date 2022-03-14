package com.github.panarik.javaLesson.lang.algorithms.search;

import com.github.panarik.javaLesson.lang.algorithms.search.data.Person;

import java.util.*;

public class Search {

    private static Map<String, LinkedList<String>> map = new HashMap<>(); // Map of my friends.
    private static LinkedList<Person> list = new LinkedList<>(); // Search queue.

    private static Person you = new Person("You", new LinkedList<>(List.of(new String[]{"Kate", "Mary", "Bob"})), true, false);
    private static Person kate = new Person("Kate", new LinkedList<>(List.of(new String[]{"Sally", "Bill"})), true, false);
    private static Person mary = new Person("Mary", new LinkedList<>(List.of(new String[]{"Kate"})), true, false);
    private static Person bob = new Person("Bob", new LinkedList<>(List.of(new String[]{"Kate", "Roman", "You"})), true, false);


    public static void main(String[] args) {

        createPersonGraph();
        addPersons();
        searchEmployee();
    }

    private static void createPersonGraph() {
        map.put("You",new LinkedList<>(List.of(new String[]{"Kate", "Mary", "Bob"})));
    }

    private static void addPersons() {
        }

    private static void searchEmployee() {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
//            list.getFirst()
        }
    }


}
