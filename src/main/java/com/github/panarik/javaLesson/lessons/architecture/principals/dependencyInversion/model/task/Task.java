package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task;

import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;

public interface Task {

    void setName(String name);

    void setPerson(Person person);

    void updateDB(int hours);

    void sendMessage();

}
