package com.github.panarik.javaLesson.lang.oop.objects;

public class Cat {
    private String name = "неизвестный кот";

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Барсик"); //передаём значение в поле объекта
        System.out.println(cat.name);

    }

    public void setName(String name) {

        /* При вызове метода в виде «объект» точка «имя метода»,
         * на самом деле вызывается метод класса, в который первым аргументом передаётся тот самый объект.
         * Внутри метода он получает имя this. Именно с ним и его данными происходят все действия.
         */
        this.name = name;
    }


}
