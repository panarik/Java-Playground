package com.github.panarik.javaLesson.lessons.lang.oop.interfaces;

public class InterfaceExample {

    public static void main(String[] args) {

        //создаём утку
        Dug dug1 = new Dug("Первая");
        //утка летает с помощью интерфейса
        dug1.fly();

        //содаём самолёт
        Plane plane1 = new Plane("Первый");
        //самолет летает с помощью интерфейса
        plane1.fly();
        System.out.print("\n");

        //------------------------------------------------------------------------------------
        //создаём массив всего летающего
        Flyable[] flyables = {
                new Dug("Первая массивная"),
                new Dug("Вторая массивная"),
                new Plane("Первый массивный"),
                new Plane("Второй массивный")
        };
        System.out.println("");
        for (Flyable flayable : flyables) {
            flayable.fly(); //все летают
            flayable.land(); //может садится (метод не абстрактный)
            if (flayable instanceof Dug) System.out.printf("%s - это утка\n",((Dug) flayable).name);
            if (flayable instanceof Plane) System.out.printf("%s - это самолет\n",((Plane) flayable).modelName);
            //проверяем, относится ли объект к определенному интерфейсу
            if (flayable instanceof Flyable) System.out.println("Может летать");
        }
        System.out.print("\n");

        //----------------------------------------------------------------------------------
        //Создаем массив любых объектов и применяем интерфейс по условию
        Object[] objects = new Object[4];
        objects[0] = new Object();
        objects[1] = new String("One");
        objects[2] = new Dug("Массивная");
        for (Object o : objects) {
            if (o instanceof Flyable) ((Flyable) o).fly();
        }
        System.out.print("\n");

        //----------------------------------------------------------------------------------------
        //вызываем статик метод интерфейса
        Flyable.doStatic();

    }


}
