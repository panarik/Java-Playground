package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factoryMethod;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factoryMethod.model.services.AbstractService;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factoryMethod.model.services.ConcreteOneService;

public class FactoryMethodEx {

    public static void main(String[] args) {
        AbstractService service = new ConcreteOneService();
        service.create();
    }

}
