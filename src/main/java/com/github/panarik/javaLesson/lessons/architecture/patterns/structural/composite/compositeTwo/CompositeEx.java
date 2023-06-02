package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeTwo;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeTwo.employee.Developer;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeTwo.employee.Employee;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeTwo.employee.Manager;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeTwo.employee.Tester;

public class CompositeEx {

    public static void main(String[] args) {
        Employee dev = new Developer();
        Employee manager = new Manager();
        Employee tester = new Tester();

        System.out.println(sumAppSalaries(dev, manager, tester));

    }

    public static int sumAppSalaries(Employee... employees) {
        int sum = 0;
        for (Employee emp : employees) {
            sum += emp.getSalary();
        }
        return sum;
    }

}
