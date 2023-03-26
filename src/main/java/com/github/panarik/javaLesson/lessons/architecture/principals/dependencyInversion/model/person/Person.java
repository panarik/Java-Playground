package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person;

public interface Person {


    String getName();
    void setName(String name);
    void setEmail(String email);
    void setPhoneNumber(int phoneNumber);
}
