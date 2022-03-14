package com.github.panarik.javaLesson.lessons.lang.generic;

import com.github.panarik.javaLesson.lessons.lang.generic.model.Box;
import com.github.panarik.javaLesson.lessons.lang.generic.model.BoxGeneric;
import com.github.panarik.javaLesson.lessons.lang.generic.model.BoxNumbers;

import java.util.List;

public class GenericExample {

    public static void main(String[] args) {

        Box box1 = new Box(5);
        Box box2 = new Box(20);
        Box box3 = new Box("Hello ");
        Box box4 = new Box("world!");

        //----------------------------------------------------------------
        //1. приводим к нужному типу руками
        System.out.println((int) box1.getObject() + (int) box2.getObject());

        //-----------------------------------------------------------------
        //2. используем generic
        BoxGeneric<Integer> gBox1 = new BoxGeneric<>(2);
        BoxGeneric<Integer> gBox2 = new BoxGeneric<>(20);
        BoxGeneric<String> gBox3 = new BoxGeneric<>("Hello ");
        BoxGeneric<String> gBox4 = new BoxGeneric<>("world!");
        System.out.println(gBox1.getItem() + gBox2.getItem());
        System.out.println(gBox3.getItem() + gBox4.getItem());

        //------------------------------------------------------------------
        //3. Generic с массивом
        BoxNumbers<Integer> boxI1 = new BoxNumbers<>(5, 1, 2, 3, 4);
        BoxNumbers<Integer> boxI2 = new BoxNumbers<>(5, 1, 2, 3, 4);
        BoxNumbers<Float> boxF1 = new BoxNumbers<>(5f, 1f, 2f, 3f, 4f);
        System.out.println(boxI1.sum());
        System.out.println(boxF1.sum());
        System.out.println(boxI1.equalsByAvg(boxI2));
        System.out.println(boxI1.equalsByAvg1(boxF1));
    }

    //-------------------------------------------------------------------
    // Метод с Generic
    private static <Z> Z getFirstObject(List<Z> list) {
        return list.get(0);
    }

}
