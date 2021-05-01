package com.github.panarik.javaLesson.collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        //не хранит дубликаты
        //не хранит порядок добавления элементов
        Set<String> set = new HashSet<>();
        set.add("January");
        set.add("February");
        set.add("March");
        set.add("March");
        System.out.println("Выводим список set: " + set);

        Set<Box> boxSet = new HashSet<>();
        boxSet.add(new Box(1, 1));
        boxSet.add(new Box(2, 2));
        boxSet.add(new Box(3, 3));
        boxSet.add(new Box(3, 3));
        System.out.println("Выводим список boxSet: " + boxSet);
        System.out.println("\nПроходим с помощью foreach");
        for (Box box : boxSet) {
            System.out.println(box);
        }
        System.out.println("\nПроходим с помощью Iterator");
        Iterator iterator = boxSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nПроходим с метода");
        boxSet.forEach(System.out::println);

        //не хранит дубликаты
        //хранит порядок добавления элементов
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("One");
        linkedSet.add("Two");
        linkedSet.add("Three");
        linkedSet.add("Three");
        System.out.println("\nВыводим список linkedSet: " + linkedSet);

        //сразу сортирует элементы
        //не хранит дубликаты
        //не используется хеш
        Set<BoxForTree> threeSet = new TreeSet<>();
        threeSet.add(new BoxForTree(2, 2));
        threeSet.add(new BoxForTree(1, 1));
        threeSet.add(new BoxForTree(3, 3));
        threeSet.add(new BoxForTree(3, 3));
        System.out.println(threeSet);


    }

    private static class Box {
        int width;
        int height;

        Box(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    private static class BoxForTree implements Comparable<BoxForTree> {

        int width;
        int height;

        public BoxForTree(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public int compareTo(BoxForTree o) {
            return this.width * this.height - o.width * o.height;
        }

        @Override
        public String toString() {
            return "BoxForTree{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }


}
