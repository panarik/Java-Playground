package com.github.panarik.javaLesson.lessons.streams.collectionStreams.data;

public class Person {

    private final String name;
    private final int age;
    public final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     *
     * @return
     */
    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
