package com.github.panarik.javaLesson.lang.collections;

import com.github.panarik.javaLesson.lang.collections.model.Box;

import java.util.*;
import java.util.function.Consumer;

public class ListExample {

    public static void main(String[] args) {

        //список со строками
        List<String> list = new ArrayList<>();

        //дополняем список данными
        list.add("January");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add(2, "Добавили в index_2");
        //добавить другой список
        list.addAll(Arrays.asList("Первый", "Второй", "Третий"));
        //заменить элемент
        list.set(2, "Заменили в index_2");
        //удалить элемент
        list.remove("March");
        //выводим
        System.out.println("Выводим список: " + list);
        System.out.println("Выводим первый элемент списка: " + list.get(0));
        System.out.println("Выводим длину списка: " + list.size());
        System.out.println("Ищем January: " + list.contains("January"));
        System.out.println("Ищем индекс January: " + list.indexOf("January"));
        System.out.println("Ищем последний индекс January: " + list.lastIndexOf("January"));

        //второй вариант
        List<Box> boxes = List.of(
                new Box(15),
                new Box(35),
                new Box(-5)
        );
        System.out.println("Get boxes: " + boxes);


        //сортируем по длине строки (по возрастанию)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(list);

        //сортируем по длине строки (по убыванию)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(list);

        //проходим по списку
        for (int i = 0; i < list.size(); i++) System.out.printf("Запись с индексом %s: %s\n", i, list.get(i));
        for (String s : list) System.out.println(s);

        //проходим итератором
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Удаляем элемент: " + iterator.next()); //какой элемент проходим
            iterator.remove(); //удаляем этот элемент
        }
        System.out.println("Список после удаления: " + list);

        // Проходим другим итератором.
        list.add("first");
        ListIterator iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            iterator1.add("Добавили итератором");
            System.out.println("Есть ли предыдущий элемент: " + iterator1.hasPrevious());
            System.out.println(list);
        }
        list.clear();

        //проходим методом forEach()
        list.add("First");
        list.add("Second");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("элемент: " + s);
            }
        });

        //другой тип списка
        LinkedList<Box> linkedList = new LinkedList<>();
        linkedList.addFirst(new Box(1));
        linkedList.addFirst(new Box(10));
        linkedList.addFirst(new Box(50));
        System.out.println(linkedList.peekFirst());

    }


}
