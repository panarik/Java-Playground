package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factoryMethod.model.services;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factoryMethod.model.interfaces.SomeInterface;

public abstract class AbstractService {

    public void work() {
        SomeInterface someInterface = create();
        someInterface.differentWork();
    }

    public abstract SomeInterface create(); //Each concrete child class will use different interface realizations.

}
