package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factoryMethod.model.services;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factoryMethod.model.interfaces.SomeInterface;

public class ConcreteOneService extends AbstractService {


    public SomeInterface create() {
        return new SomeInterface() {
            @Override
            public void differentWork() {
                System.out.println("Do some work one");
            }
        };
    }
}
