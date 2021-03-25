package com.github.panarik.javaLesson.work5.task1;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {


    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    //создаём конструктор
    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printEmployee() {

        System.out.println("имя: " + this.name);
        System.out.println("должность: " + this.position);
        System.out.println("email: " + this.email);
        System.out.println("телефон: " + this.phone);
        System.out.println("зарплата: $" + this.salary);
        System.out.println("возраст: " + this.age);

    }


}
