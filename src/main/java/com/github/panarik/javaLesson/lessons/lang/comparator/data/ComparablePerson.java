package com.github.panarik.javaLesson.lessons.lang.comparator.data;

import com.github.panarik.javaLesson.lessons.streams.collectionStreams.data.Gender;
import org.jetbrains.annotations.NotNull;

public class ComparablePerson implements Comparable<ComparablePerson> {

    private final String name;
    private final int age;
    private final Gender gender;

    public ComparablePerson(String name, int age, Gender gender) {
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


    public int compareTo(@NotNull ComparablePerson person) {
        char thisNameChar = this.name.charAt(0);
        char personNameChar = person.name.charAt(0);
        return (byte) thisNameChar - (byte) personNameChar;
    }

}
