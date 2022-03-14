package com.github.panarik.javaLesson.lang.collections;

import com.github.panarik.javaLesson.lang.collections.model.Box;

import java.util.*;
import java.util.function.Consumer;

public class ListExample {

    public static void main(String[] args) {

        sort();
        //another();
    }

    private static void another() {
        //список со строками
        List<String> list = new ArrayList<>();

        //дополняем список данными
        list.add("January");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add(2, "Insert into index 2");
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
                int result = (int) resultLong;
                return result;
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
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(list);
    }

    private static void sortByLengthIncrese(ArrayList<String> list) {
        //сортируем по длине строки (по возрастанию)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(list);
    }


}
