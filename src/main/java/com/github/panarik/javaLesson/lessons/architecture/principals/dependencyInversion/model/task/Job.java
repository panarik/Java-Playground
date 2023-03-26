package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task;

import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.DataBaseProvider;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.SQLDB;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Email;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Messenger;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Employee;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;

public class Job implements Task {

    private String name;
    private Person person;
    private DataBaseProvider dataBase;
    private Messenger messenger;

    public Job(DataBaseProvider dataBase, Messenger messenger) {
        this.dataBase = dataBase;
        this.messenger = messenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void updateDB(int hours) {

        // Depends on low level concrete class SQLDB.
        new SQLDB().update(String.format("Updated DB of %s with %s hours", this.person.getName(), hours));
    }

    public void sendMessage() {

        // Depends on low level concrete class SQLDB.
        new Email().send(String.format("Send to %s", person.getName()));
    }

}
