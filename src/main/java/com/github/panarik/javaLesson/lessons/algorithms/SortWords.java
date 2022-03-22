package com.github.panarik.javaLesson.lessons.algorithms;

import java.util.ArrayList;

//Сортировка слов по алфавиту
public class SortWords {

    public static void main(String[] args) {
        //Заполняем список словами
        ArrayList<String> list = new ArrayList<>();
        list.add("Вишня");
        list.add("Боб");
        list.add("Яблоко");
        list.add("Арбуз");
        System.out.println("Список до сортировки: "+list);
        System.out.println("Проверяем, что Боб находится ближе к началу алфавита чем Вишня: " + isGreaterThan("Вишня", "Боб"));

        //Сортировка
        /*
         1. проходим по листу
         2. сравниваем на каждом проходе все значения от начала листа до текущей (выбранного в этом проходе) позиции
         3. Если выбранное значение имеет приоритет над значением выше списка, то двигаем его вниз и перемещаемся на позицию выше, чтобы сравнивать следующую пару
         4. Когда понимаем что выбранное значение имеет максимальный приоритет из значений в списке, то ставим его на эту позицию
        */

        for (int i = 1; i < list.size(); i++) {
            String current = list.get(i); //выбранное значение, которое выдергиваем из списка сравниваем с остальными
            int temp = i; //временная позиция, которая нужна, чтобы (на каждом этапе for'а) переходить от текущего до верхнего значения в списке

            while (temp > 0 /* до тех пор, пока не проверим все пары значений до вершины списка
                               если уже находимся на 0 то пропускаем следующую проверку, т.к. иначе будет сравнение с предыдущей позицией, а именно -1
                            */
                    &&
                    isGreaterThan(list.get(temp - 1), current)) { //сравниваем значение из текущей пары и выбранное
                list.set(temp, list.get(temp-1)); //сдвигаем значение ниже по списку, чтобы проверить следующую пару
                temp--; //двигаем пару проверки выше по списку
            }
            list.set(temp, current);//когда пришли к началу списка, то ставим самое приоритетное значение на текущее место
        }
        System.out.println("Список после сортировки: "+list);

    }

    //проверяем, действительно ли original приоритетнее чем target
    private static boolean isGreaterThan(String target, String original) {
        /*
         * метод возвращает сколько позиций target дальше по алфавиту чем original
         * значение увеличивается в ПЛЮС - чем дальше по алфавиту target (следовательно у original больше приоритет)
         * значение увеличивается в МИНУС - чем дальше по алфавиту original (следовательно у original меньше приоритет)
         */
        int howGreater = target.compareTo(original);
        //возвращаем TRUE если у original больше приоритет
        return howGreater > 0;
    }


}