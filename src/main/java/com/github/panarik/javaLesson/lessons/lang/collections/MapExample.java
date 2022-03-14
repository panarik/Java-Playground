package com.github.panarik.javaLesson.lessons.lang.collections;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        //Список (ключ, значение)
        //Ключ должен быть уникальным
        //не хранит порядок добавления элементов
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 111);
        map.put("One", 111111); //перезаписывает
        map.putIfAbsent("One", 222222); //перезаписывает если пусто
        map.put("Two", 222);
        map.put("Three", 333);
        map.put("Four", 333);

        System.out.println("Вывести список: " + map);
        System.out.println("Найти элемент: " + map.get("Two"));
        System.out.println("Найти элемент или вывести default: " + map.getOrDefault("Two1", 0));

        //вывести ключи
        Set<String> keys = map.keySet();
        System.out.println("Вывести ключи: "+keys);

        //вывести значения
        Collection<Integer> values = map.values();
        System.out.println(values);

        //проходим с помощью метода
        map.forEach((k, v) -> System.out.println(k + " " + v));

        //Проходим с помощью for
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Ключ: "+entry.getKey());
            System.out.println("Значение: "+entry.getValue());
        }
    }

}
