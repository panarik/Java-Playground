package com.github.panarik.javaLesson.season3.work1;

import com.github.panarik.javaLesson.season3.work1.model.Apple;
import com.github.panarik.javaLesson.season3.work1.model.Box;
import com.github.panarik.javaLesson.season3.work1.model.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        /*
        1. Написать метод, который меняет два элемента массива местами.
        (массив может быть любого ссылочного типа);
        */
        Integer[] array = new Integer[3];
        array[0] = 100;
        array[2] = 202;
        swap(array, 0, 2);
        System.out.println(array[0]);
        System.out.println(array[2]);


        /*
        2. Написать метод, который преобразует массив в ArrayList;
         */
        Integer[] arr = new Integer[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        System.out.println(createArrayList(arr));

        /*
        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты.
        Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        Для хранения фруктов внутри коробки можно использовать ArrayList;
        */
        Box<Apple> boxApples = new Box<>(); //создаём ящик для яблок
        boxApples.addFruit(new Apple(1.0f)); //кладем в коробку яблоко
        boxApples.addFruit(new Apple(1.0f)); //кладем в коробку яблоко
        boxApples.addFruit(new Apple(1.0f)); //кладем в коробку яблоко
        System.out.println(boxApples.viewFruits()); //смотрим, что в коробке

        //пробуем положить в коробку апельсины
        //boxApples.addFruit(new Orange(1.5f));

        /*
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f,
        апельсина – 1.5f (единицы измерения не важны);
         */
        System.out.println("Box weight is "+ boxApples.getWeightFruits()); //взвешиваем фрукты в коробке

        /*
        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare()
        в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
        */
        Box<Orange> boxOranges = new Box<>();
        boxOranges.addFruit(new Orange(1.5f));
        boxOranges.addFruit(new Orange(1.5f));
        System.out.println(boxOranges.compare(boxApples));

        /*
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        */

    }

    private static <A> A[] swap(A[] array, int first, int second) {
        A temp = array[first];
        array[first] = array[second];
        array[second] = temp;
        return array;
    }

    private static <E> ArrayList<E> createArrayList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }


}
