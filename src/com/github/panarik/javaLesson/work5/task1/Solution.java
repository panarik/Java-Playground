package com.github.panarik.javaLesson.work5.task1;

import com.github.panarik.javaLesson.objects.SimpleObjectClass;

import java.time.Year;
import java.util.Date;

public class Solution {




    public static void main(String[] args) {

        //2. Конструктор класса должен заполнять эти поля при создании объекта.
        Employee employee1 = new Employee();
        employee1.setEmployee("Pupkin Vasiliy Bombichesky", "director", "vasya@main.com", "+1-000-000-00-00", 20000, (Year.now().getValue() - 1986));

        //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        System.out.println("Информация о сотруднике:");
        employee1.printEmployee();

        //4. Создать массив из 5 сотрудников.
        Employee[] employeesArray = new Employee[5];
        employeesArray[0].setEmployee("One", "Engineer", "one@mail.com", "+1-000-000-00-01", 8000, (Year.now().getValue() - 1996));
        employeesArray[1].setEmployee("Two", "Engineer", "two@mail.com", "+1-000-000-00-02", 7000, (Year.now().getValue() - 1986));
        employeesArray[2].setEmployee("Three", "Engineer", "three@mail.com", "+1-000-000-00-03", 6000, (Year.now().getValue() - 1976));
        employeesArray[3].setEmployee("Four", "Engineer", "four@mail.com", "+1-000-000-00-04", 5000, (Year.now().getValue() - 1966));
        employeesArray[4].setEmployee("Five", "Engineer", "five@mail.com", "+1-000-000-00-05", 4000, (Year.now().getValue() - 1956));

        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                System.out.println("\nИнвормация о сотруднике"+employeesArray[i].getName()+" старше 40 лет");
                employeesArray[i].printEmployee();
            }
        }
    }

}
