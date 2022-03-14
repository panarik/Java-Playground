package com.github.panarik.javaLesson.lessons.lang.values.links.access;

public class LinkOnObject {

    public static void main(String[] args){

        //первый студент
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 21;

        //второй студент
        Student vera = new Student();
        vera.name = "Vera";
        vera.age = 15;

        //Выводим возраст студентов
        System.out.println("Olga age = "+olga.age);
        System.out.println("Vera age = "+vera.age);

        //Применяем метод, который должен менять значения переменных
        swapSwap(olga, vera);

        //Повторно выводим возраст студентов используя те же переменные
        System.out.println("Olga age after swap = "+olga.age);
        System.out.println("Vera age after swap = "+vera.age);
    }

    /* При присваивании ссылочной переменной (ссылка на объект), копируется только адрес объекта, сам же объект при этом не копируется.
     * В итоге операции над a и b меняют значения внутри объектов olga и vera
    */
    private static void swapSwap(Student a, Student b) {


        int c = a.age;
        a.age = b.age;
        b.age = c;

    }


    public static class Student{

        String name;
        int age;

    }

}
