package com.github.panarik.javaLesson.lessons.streams.collectionStreams;

import com.github.panarik.javaLesson.lessons.streams.collectionStreams.data.Gender;
import com.github.panarik.javaLesson.lessons.streams.collectionStreams.data.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionStreamsExample {

    public static void main(String[] args) {

        List<Person> persons = getPeople();

        // Filter.
        System.out.println("\nList is filtered by 'Gender.MALE'.");
        System.out.println(filter(persons, Gender.MALE));
        System.out.println("\nList is filtered by 'Gender.FEMALE'.");
        System.out.println(filter(persons, Gender.FEMALE));

        // Sort.
        System.out.println("\nList is sorted by person's less age.");
        System.out.println(sort(persons));

        // All match.
        System.out.println("All persons age's more than 18: " + allMatch(persons));

        // Any match.
        System.out.println("At least on person should be 19 years old: " + anyMatch(persons));

        // None match.
        System.out.println("No one hase age greater than 100: " + noneMatch(persons));

        // Get max value.
        getMaxAge(persons);

        // Get min value.
        getMinAge(persons);

        // Grouping.
        System.out.println(groupByGenderMethod(persons, Person::getGender));
        System.out.println(groupByGenderProperty(persons));

    }


    /**
     * Stream filter example.
     * @param persons
     * @param gender
     * @return
     */
    private static List<Person> filter(List<Person> persons, Gender gender) {
        return persons.stream() // Get stream API.
                .filter((person -> person.getGender().equals(gender))) // Filter each Person from list.
                .collect(Collectors.toList()); // Collect filtered list to new list.
    }

    private static List<Person> sort(List<Person> persons) {
        return persons.stream() // Get stream API.
                .sorted(Comparator.comparingInt(Person::getAge)) // Sort using standard Comparator.
                .collect(Collectors.toList()); // Collect filtered list to new list.
    }

    /**
     * Return boolean that all persons of list should match with.
     * All persons from list should have age more than 18.
     *
     * @param persons List of persons.
     * @return {@link true} all persons from have age more than 18. {@link false} if they don't.
     */
    private static boolean allMatch(List<Person> persons) {
        return persons.stream()
                .allMatch(person -> person.getAge() > 18);
    }

    /**
     * Return boolean that at least one item of list should match with.
     * At least on person should be 19 years old
     *
     * @param persons List of persons.
     * @return {@link true} if at least one person should be 19 years old. {@link false} if nobody has 19 years.
     */
    private static boolean anyMatch(List<Person> persons) {
        return persons.stream()
                .anyMatch(person -> person.getAge() == 19);
    }

    /**
     * Return boolean that no one item of list should match with.
     *
     * @param persons List of persons.
     * @return {@link true} if nobody has age greater than 100. {@link false} if someone has age greater than 100.
     */
    private static boolean noneMatch(List<Person> persons) {
        return persons.stream()
                .noneMatch(person -> person.getAge() > 100);
    }

    /**
     * Print person's max age from persons list.
     *
     * @param persons List of persons.
     */
    private static void getMaxAge(List<Person> persons) {
        persons.stream()
                .max(Comparator.comparingInt(Person::getAge)) // find max person's age.
                .ifPresent(person -> System.out.println("Person with max age is: " + person.getName() + ". It is " + person.getAge() + " years old."));
    }

    /**
     * Print person's min age from persons list.
     *
     * @param persons List of persons.
     */
    private static void getMinAge(List<Person> persons) {
        persons.stream()
                .min(Comparator.comparingInt(Person::getAge)) // find max person's age.
                .ifPresent(person -> System.out.println("Person with min age is: " + person.getName() + ". It is " + person.getAge() + " years old."));
    }

    /**
     * Get map grouping by persons gender.
     *
     * @param persons   List of persons.
     * @param getGender Function returns persons gender.
     * @return Map with grouping by person's gender.
     */
    private static Map<Gender, List<Person>> groupByGenderMethod(List<Person> persons, Function<? super Person, Gender> getGender) {
        return persons.stream()
                .collect( // Extract map by grouping persons gender.
                        Collectors.groupingBy(getGender) // Use method for getting each person's gender from persons list.
                );
    }

    /**
     * Get map grouping by persons gender.
     *
     * @param persons List of persons.
     * @return Map with grouping by person's gender.
     */
    private static Map<Gender, List<Person>> groupByGenderProperty(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(person -> person.gender)); // Use Person.gender property for getting each person's gender from persons list.
    }

    private static List<Person> getPeople() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Anna", 19, Gender.FEMALE));
        persons.add(new Person("Max", 25, Gender.MALE));
        persons.add(new Person("Tom", 55, Gender.MALE));
        persons.add(new Person("Jerry", 21, Gender.MALE));
        persons.add(new Person("Liza", 45, Gender.FEMALE));
        return persons;
    }

}
