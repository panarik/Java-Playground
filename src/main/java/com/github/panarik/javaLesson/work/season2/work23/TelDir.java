package com.github.panarik.javaLesson.work.season2.work23;


import java.util.HashMap;
import java.util.Map;

public class TelDir {



    static Map<Integer, String> tels = new HashMap<>();

    public static void main(String[] args) {

        add("One", 11111);
        add("Two", 222222);
        add("Three", 333333);
        add("Four", 444444);
        add("Five", 555555);
        add("Five", 666666);

        get("Five");


    }

    private static void add(String name, int tel) {
        tels.put(tel, name);
    }

    private static void get(String name) {

        for (Map.Entry<Integer, String> entry : tels.entrySet()) {
            if (entry.getValue().equals(name)) System.out.println(entry.getKey());
        }
    }


}
