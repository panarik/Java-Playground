package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model;

import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.DataBaseProvider;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.SQLDB;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Email;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Messenger;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Employee;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task.Job;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task.Task;

public class Manager {

    public static Person createPerson() {
        return new Employee();
    }

    public static Task createJob() {
        Messenger messenger = createMessenger();
        DataBaseProvider dataBase =createDataBase();
        return new Job(dataBase, messenger);
    }

    private static Messenger createMessenger() {
        return new Email();
    }

    private static DataBaseProvider createDataBase() {
        return new SQLDB();
    }


}
