package com.github.panarik.javaLesson.lessons.lang.reflection.hiber;

import com.github.panarik.javaLesson.lessons.lang.reflection.hiber.obj.Cat;
import com.github.panarik.javaLesson.lessons.lang.reflection.hiber.obj.Employee;

public class HiberTest {
    public static void main(String[] args) {
        LittleHiber.createTable(Cat.class);
        Cat[] cats = {
                new Cat(1, "Barsik", "white"),
                new Cat(2, "Murzik", "gray"),
                new Cat(3, "Murka", "black")
        };
        for (Cat cat : cats) LittleHiber.insert(cat);

        LittleHiber.createTable(Employee.class);
        Employee[] employees = {
                new Employee(1, "One", 20, 500, "123@mail.com", "+12345", "abcdefgh123"),
                new Employee(2, "Two", 25, 1500, "123@mail.com", "+12345", "abcdefgh123"),
                new Employee(3, "Three", 30, 2500, "123@mail.com", "+12345", "abcdefgh123"),
                new Employee(4, "Four", 35, 3500, "123@mail.com", "+12345", "abcdefgh123"),
                new Employee(5, "Five", 40, 4500, "123@mail.com", "+12345", "abcdefgh123"),
        };
        for (Employee emp : employees) {
            LittleHiber.insert(emp);
        }
    }
}
