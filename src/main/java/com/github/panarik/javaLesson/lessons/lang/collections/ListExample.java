package com.github.panarik.javaLesson.lessons.lang.collections;

import com.github.panarik.javaLesson.lessons.lang.collections.model.Box;

import java.util.*;
import java.util.function.Consumer;

public class ListExample {

    public static void main(String[] args) {

        addingEx();
        iterateEx();
        sort();

    }

    private static void addingEx() {

        // Create empty array list.
        List<String> list = new ArrayList<>();

        // Adding some elements to end position.
        list.add("January");
        list.add("January");
        list.add("February");
        list.add("March");

        // Add element to exact position. All bottom positions will be moved down.
        list.add(2, "Insert into index 2");

        // Add another ArrayList.
        list.addAll(Arrays.asList("First", "Second", "Third"));

        // Set element to exact position.
        // This element will replace existing element at the same position.
        list.set(2, "Set to index_2");

        // Delete element.
        list.remove("March");

        // Print
        System.out.println("Show whole list: " + list);
        System.out.println("Show first element: " + list.get(0));
        System.out.println("Show list length: " + list.size());
        System.out.println("Looking 'January' exist on the list or not: " + list.contains("January"));
        System.out.println("Looking index of 'January' if exist: " + list.indexOf("January"));
        System.out.println("Looking last index of 'January' if exist: " + list.lastIndexOf("January"));

        //List with objects.
        List<Box> boxes = List.of(
                new Box(15),
                new Box(35),
                new Box(-5)
        );
        System.out.println("Get boxes: " + boxes);
    }

    private static void iterateEx() {
        List<String> list = new ArrayList<>();
        list.add("January");
        list.add("January");

        // List loop.
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Запись с индексом " + i + ": " + list.get(i) + ".");
        }
        for (String s : list) System.out.println(s);

        // Iterate with deleting.
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Will delete element: " + iterator.next());
            iterator.remove(); // Delete element.
        }
        System.out.println("Show result list: " + list);

        // Iterate with adding.
        list.add("first");
        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            iterator1.add("Element adding by iterator"); // Adding this element with places before than place .hasNext() element.
            System.out.println("Have any previous element: " + iterator1.hasPrevious());

            // Adding before rich the list size.
            if (list.size() > 5) break;
        }
        System.out.println(list);
        list.clear();

        //Loop via forEach().
        list.add("First");
        list.add("Second");
        list.forEach(s -> System.out.println("элемент: " + s));
    }

    private static void sort() {

        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("1");
        list.add("AA");
        list.add("CC");
        list.add("BB");
        list.add("January");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add(2, "Insert into index 2");

        sortByLengthIncrese(list);
        sortByLengthDecrese(list);
        sortByABC(list);
        sortByCBA(list);
    }

    private static void sortByCBA(ArrayList<String> list) {
        // Сортируем по алфавиту руками.
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                long long1;
                StringBuilder builder1 = new StringBuilder();
                long long2;
                StringBuilder builder2 = new StringBuilder();

                for (int i = 0; (i < o1.length() && i < 3); i++) {
                    byte b = (byte) o1.charAt(i);
                    builder1.append(b);
                }
                String string1 = builder1.toString();
                long1 = Long.parseLong(string1);

                for (int j = 0; (j < o2.length() && j < 3); j++) {
                    byte b = (byte) o2.charAt(j);
                    builder2.append(b);
                }
                String string2 = builder2.toString();
                long2 = Long.parseLong(string2);
                long resultLong = long2 - long1;
                return (int) resultLong;
            }
        });
        System.out.println(list);
    }

    private static void sortByABC(ArrayList<String> list) {
        // Сортируем по алфавиту.
        Collections.sort(list);
        System.out.println(list);
    }

    private static void sortByLengthDecrese(ArrayList<String> list) {
        //сортируем по длине строки (по убыванию)
        list.sort((o1, o2) -> o2.length() - o1.length());
        System.out.println(list);
    }

    private static void sortByLengthIncrese(ArrayList<String> list) {
        //сортируем по длине строки (по возрастанию)
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }


}
