package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model;

import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task.Task;

public class StartUI {

    public static void main(String[] args) {

        Person person = Manager.createPerson();
        person.setName("Jon Doe");
        person.setEmail("jon@mail.com");

        Task job = Manager.createJob();
        job.setName("My Job");
        job.setPerson(person);
        job.updateDB(5);
        job.sendMessage();
    }

}
