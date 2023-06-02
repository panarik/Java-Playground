package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeTwo.employee;

public class Manager implements Employee {

    public int getSalary() {
        return 3000;
    }

    public String getRole() {
        return "Manager";
    }
}
