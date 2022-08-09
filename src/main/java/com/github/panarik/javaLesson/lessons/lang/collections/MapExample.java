package com.github.panarik.javaLesson.lessons.lang.collections;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        // Create map.
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 111);
        map.put("One", 111111); // Will replace value at the same key.
        map.putIfAbsent("One", 222222); // Will replace only EMPTY value at the same key.
        map.put("Two", 222);
        map.put("Three", 333);
        map.put("Four", 333);

        // Get map values.
        System.out.println("How map: " + map);
        System.out.println("Looking value from map using key 'Two': " + map.get("Two"));
        System.out.println("Looking value from map using key 'Two1' or return default value: " + map.getOrDefault("Two1", 0));

        // Get map keys set.
        Set<String> keys = map.keySet();
        System.out.println("Get keys set: " + keys);

        // Get map values set.
        Collection<Integer> values = map.values();
        System.out.println("Get values set: " + values);

        // Map looping.
        map.forEach((k, v) -> System.out.println(k + " " + v));

        // Map looping 2.
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

    }

}
