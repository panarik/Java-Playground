package com.github.panarik.javaLesson.lang.oop.objects;

public class SimpleObjectClass {

    int one;

    public static void main(String[] args) {

        //1. объект класса SimpleObjectClass (используются поля из этого класса)
        SimpleObjectClass object = new SimpleObjectClass();  //инициализировали объект класса SimpleObjectClass
        object.one = 1;                                      //присвоили полю объекта значение 1
        System.out.println("Первый объект имеет значение поля one = " + object.one);

        //2. объект класса Person (используются поля из этого класса)
        Person person = new Person();                        //Инициализируем новый объект класса Person (поля прописаны в классе)
        person.name = "Alex";                                //присваиваем полю объекта значение "alex"
        System.out.println("Мое имя - " + person.name);
    }


    public static class Person {

        String name;
        int age;
    }
}
