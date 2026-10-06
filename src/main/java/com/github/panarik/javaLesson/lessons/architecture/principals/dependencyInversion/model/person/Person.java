package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person;

/**
 * Абстракция участника задачи.
 * <p>
 * Что показываем: клиентский код ({@code StartUI}, {@code Job}) оперирует интерфейсом,
 * а не классом. За интерфейсом может скрываться любая реализация — сейчас Employee,
 * завтра, например, Contractor.
 * <p>
 * Для чего нужно: это «верхняя половина» инверсии зависимостей — сначала выделяем
 * абстракцию, и только потом пишем конкретные классы, которые от неё зависят.
 */
public interface Person {

    String getName();
    void setName(String name);
    void setEmail(String email);
    void setPhoneNumber(int phoneNumber);
}
