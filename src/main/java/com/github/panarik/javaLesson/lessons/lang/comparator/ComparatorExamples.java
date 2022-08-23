package com.github.panarik.javaLesson.lessons.lang.comparator;

import com.github.panarik.javaLesson.lessons.lang.comparator.data.ComparablePerson;
import com.github.panarik.javaLesson.lessons.streams.collectionStreams.data.Gender;
import com.github.panarik.javaLesson.lessons.streams.collectionStreams.data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Samples of using {@link Comparator} class.
 */
public class ComparatorExamples {

    public static void main(String[] args) {

        List<ComparablePerson> comparablePersons = createComparablePersons();
        List<Person> persons = createPersons();

        sortObjects(comparablePersons);
        sortByPrimitives(persons);
        sortReversed(persons);
        sortTwoStages(persons);
    }

    /**
     * Sort list with comparing objects itself.
     * Objects have implemented {@link Comparable} interface for it.
     *
     * @param comparablePersons List of persons.
     */
    private static void sortObjects(List<ComparablePerson> comparablePersons) {
        comparablePersons.sort(Comparator.comparing(person -> person)); // Gives object itself because this object implements Comparable interface.
        System.out.println("\nList is sorted by ComparablePerson's name ASCENDING:");
        System.out.println(comparablePersons);
        Collections.shuffle(comparablePersons);
    }

    /**
     * Sort list with comparing primitives in object properties.
     *
     * @param persons List of persons.
     */
    private static void sortByPrimitives(List<Person> persons) {
        persons.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("\nList is sorted by Person age ASCENDING:");
        System.out.println(persons);
        Collections.shuffle(persons);
    }

    /**
     * Sort list with reversed {@link Comparator}.
     *
     * @param persons List of persons.
     */
    private static void sortReversed(List<Person> persons) {
        persons.sort(Comparator.comparingInt(Person::getAge).reversed());
        System.out.println("\nList is sorted by Person age DESCENDING:");
        System.out.println(persons);
        Collections.shuffle(persons);
    }

    /**
     * Sort list with two stages of {@link Comparator}. Firstly by name and secondary by age.
     *
     * @param persons List of persons.
     */
    private static void sortTwoStages(List<Person> persons) {
        persons.sort(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge));
        System.out.println("\nList is sorted by Person name then by Person age:");
        System.out.println(persons);
        Collections.shuffle(persons);
    }

    private static List<ComparablePerson> createComparablePersons() {
        List<ComparablePerson> persons = new ArrayList<>();
        persons.add(new ComparablePerson("Mike", 18, Gender.MALE));
        persons.add(new ComparablePerson("Mike", 28, Gender.MALE));
        persons.add(new ComparablePerson("Anna", 25, Gender.FEMALE));
        persons.add(new ComparablePerson("Anna", 32, Gender.FEMALE));
        persons.add(new ComparablePerson("Nicole", 26, Gender.FEMALE));
        persons.add(new ComparablePerson("Nicole", 29, Gender.FEMALE));
        persons.add(new ComparablePerson("Alex", 39, Gender.MALE));
        persons.add(new ComparablePerson("Alex", 16, Gender.MALE));
        persons.add(new ComparablePerson("Tom", 50, Gender.MALE));
        persons.add(new ComparablePerson("Tom", 2, Gender.MALE));
        persons.add(new ComparablePerson("Merry", 73, Gender.FEMALE));
        persons.add(new ComparablePerson("Merry", 5, Gender.FEMALE));
        return persons;
    }

    private static List<Person> createPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mike", 18, Gender.MALE));
        persons.add(new Person("Mike", 28, Gender.MALE));
        persons.add(new Person("Anna", 25, Gender.FEMALE));
        persons.add(new Person("Anna", 32, Gender.FEMALE));
        persons.add(new Person("Nicole", 26, Gender.FEMALE));
        persons.add(new Person("Nicole", 29, Gender.FEMALE));
        persons.add(new Person("Alex", 39, Gender.MALE));
        persons.add(new Person("Alex", 16, Gender.MALE));
        persons.add(new Person("Tom", 50, Gender.MALE));
        persons.add(new Person("Tom", 2, Gender.MALE));
        persons.add(new Person("Merry", 73, Gender.FEMALE));
        persons.add(new Person("Merry", 5, Gender.FEMALE));
        return persons;
    }

}
