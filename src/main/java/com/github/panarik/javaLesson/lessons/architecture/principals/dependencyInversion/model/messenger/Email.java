package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger;

public class Email implements Messenger {

    public void send(String text) {
        System.out.println("EMAIL: " + text);
    }

}
