package com.github.panarik.javaLesson.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args){

        //не хранит дубликаты
        //не хранит порядок добавления элементов
        Set<String> set = new HashSet<>();
        set.add("January");
        set.add("February");
        set.add("March");
        set.add("March");
        System.out.println(set);

        Set<Box> boxSet = new HashSet<>();
        boxSet.add(new Box(1,1));
        boxSet.add(new Box(2,2));
        boxSet.add(new Box(3,3));
        boxSet.add(new Box(3,3));

        System.out.println("Выводим список: "+boxSet);

        System.out.println("\nПроходим с помощью foreach");
        for (Box box : boxSet) {
            System.out.println(box);
        }

        System.out.println("\nПроходим с помощью Iterator");
        Iterator iterator = boxSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
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




}
