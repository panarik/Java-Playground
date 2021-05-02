package com.github.panarik.javaLesson.work23;


import java.util.HashMap;
import java.util.Map;

public class TelDir {



    static Map<String, Integer> tels = new HashMap<>();

    public static void main(String[] args) {

        add("Name1", 11111);
        add("Name2", 22222);
        add("Name3", 33333);
        add("Name3", 44444);

        get("Name3");

    }

    private static void add(String name, int tel) {
        tels.put(name, tel);
    }

    private static void get(String name) {

        for (Map.Entry<String, Integer> entry : tels.entrySet()) {
            if (entry.getKey().equals(name)) System.out.println(entry.getValue());
        }
    }


}
