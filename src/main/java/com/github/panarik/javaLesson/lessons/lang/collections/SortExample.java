package com.github.panarik.javaLesson.lessons.lang.collections;

import com.github.panarik.javaLesson.lessons.lang.collections.model.Bag;
import com.github.panarik.javaLesson.lessons.lang.collections.model.Box;

import java.util.*;

public class SortExample {

    public static void main(String[] args) {
        defaultSort();
        customSort();
    }

    private static void defaultSort() {
        //Готовая сортировка
        List<Integer> digits = new ArrayList<>();
        digits.add(5);
        digits.add(2);
        digits.add(50);
        Collections.sort(digits);
        System.out.println(digits);
    }

    private static void customSort() {
        //Первый вариант (Comparator в классе)
        List<Box> boxes = new ArrayList<>(Arrays.asList(
                new Box(15),
                new Box(35),
                new Box(-5)
        ));
        //до сортировки
        System.out.println(boxes);
        //сортируем коробки (метод сортировки в классе Box)
        Collections.sort(boxes);
        //после сортировки
        System.out.println(boxes);

        //Второй вариант (Comparator вызывается отдельно)
        List<Bag> bags = new ArrayList<>(Arrays.asList(
                new Bag(15),
                new Bag(35),
                new Bag(-5)
        ));
        //до сортировки
        System.out.println(bags);
        //сортируем коробки (метод сортировки в классе Box)
        Collections.sort(bags, new Comparator<Bag>() {
            @Override
            public int compare(Bag o1, Bag o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        //после сортировки
        System.out.println(bags);
    }

}
