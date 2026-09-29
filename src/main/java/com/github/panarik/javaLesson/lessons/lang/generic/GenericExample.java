package com.github.panarik.javaLesson.lessons.lang.generic;

import com.github.panarik.javaLesson.lessons.lang.generic.model.Box;
import com.github.panarik.javaLesson.lessons.lang.generic.model.BoxGeneric;
import com.github.panarik.javaLesson.lessons.lang.generic.model.BoxNumbers;

import java.util.ArrayList;
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

        //4. Неизвестный дженерик
        printAll(List.of(1, 2, 3));
        printAll(List.of("a", "b"));
        printAll(List.of(1.5, 2.5));

        // 5. Неизвестный наследник
        // вызов — работает со всеми наследниками Number:
        System.out.println(sum(List.of(1, 2, 3)));              // List<Integer>
        System.out.println(sum(List.of(1.5, 2.5)));             // List<Double>
        System.out.println(sum(List.of(1L, 2L, 3L)));           // List<Long>
        System.out.println(sum(List.of(1f, 2f)));               // List<Float>

        // 6. Неизвестный родитель
        List<Number> numbers = new ArrayList<>();
        fill(numbers); // ✅ Number — это super Integer

        List<Object> objects = new ArrayList<>();
        fill(objects); // ✅ Object — тоже super Integer

        List<Integer> ints = new ArrayList<>();
        fill(ints); // ✅ Integer — тривиально super себя
    }

    /**
     * Метод реализующий неизвестный дженерик.
     *
     * @param list
     */
    public static void printAll(List<?> list) {
        for (Object o : list) {
            System.out.println(o);   // читать можно — но только как Object
        }
        // list.add("x");  // НЕЛЬЗЯ — компилятор не знает тип.
        System.out.println(list.size()); //  Можно.
    }

    /**
     * Метод реализующий неизвестного наследника от Number
     *
     * @param numbers
     * @return
     */
    public static double sum(List<? extends Number> numbers) {
        double total = 0;
        for (Number n : numbers) {
            total += n.doubleValue();   // ✅ читаем как Number
        }
        // numbers.add(5);       // ❌ НЕЛЬЗЯ
        // numbers.add(5.0);     // ❌ НЕЛЬЗЯ
        return total;
    }

    /**
     * Неизвестный родитель Integer.
     *
     * @param list
     */
    public static void fill(List<? super Integer> list) {
        list.add(1);            // ✅ писать можно (Integer — подходит под "super Integer")
        list.add(2);
        list.add(3);
        // Integer x = list.get(0);  // ❌ читать как Integer нельзя — там может быть Object/Number
        Object o = list.get(0);      // ✅ только как Object
    }

    //-------------------------------------------------------------------

    /**
     * Метод с Generic
     * <Z> - компилятор читает как параметр. Без него компилятор будет искать класс Z.
     *
     * @param list
     * @param <Z>
     * @return
     */
    private static <Z> Z getFirstObject(List<Z> list) {
        return list.get(0);
    }

    /**
     * Так нельзя тк <> вообще не является допустимым синтаксисом.
     * @param list
     * @return
     * @param <>
     */
    // private static <> Z getFirstObject(List<Z> list) { return list.get(0); }
}
