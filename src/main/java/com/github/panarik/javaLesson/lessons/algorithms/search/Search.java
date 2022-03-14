package com.github.panarik.javaLesson.lessons.algorithms.search;

import com.github.panarik.javaLesson.lessons.algorithms.search.data.Person;

import java.util.*;

/**
 * Поиск в ширину.
 */
public class Search {

    private static Map<String, Person> map = new HashMap<>(); // Map of my friends.
    private static LinkedList<String> list = new LinkedList<String>(); // Search queue.

    // Create some persons with friends.
    // All friends connections contains in each person.
    private static Person you = new Person("You", new LinkedList<>(List.of(new String[]{"Kate", "Mary", "Bob"})), true, false);
    private static Person kate = new Person("Kate", new LinkedList<>(List.of(new String[]{"Sally", "Bill"})), true, false);
    private static Person mary = new Person("Mary", new LinkedList<>(List.of(new String[]{"Kate"})), true, false);
    private static Person bob = new Person("Bob", new LinkedList<>(List.of(new String[]{"Kate", "Roman", "You"})), true, false);


    public static void main(String[] args) {
        createPersonGraph();
        searchEmployee();
    }

    private static void createPersonGraph() {
        map.put("You", you);
        map.put("Kate", kate);
        map.put("Mary", mary);
        map.put("Bob", bob);
    }


    private static void searchEmployee() {

        // Step 1: put all this person friends in queue.
        list.addAll(map.get("You").friends);

        // Step 2: Get another person from queue.
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {

            // Step 2.1: Find person object by given name.
            String personMane = iterator.next(); //current person name in queue.
            Person person = map.get(personMane); //current person in queue.

            // Step 3: Check person. Does he work or not?
            if (!person.isWorking) {
                System.out.println("New Employee found!");
                return;
            }

            // Add all his friend in queue if he is working now!
            else {
                for (String friend : person.friends) {
                    list.addLast(friend);
                }
            }
        }

    }


}
