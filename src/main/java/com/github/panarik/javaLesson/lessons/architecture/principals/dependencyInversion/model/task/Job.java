package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task;

import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.DataBaseProvider;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Messenger;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;

/**
 * Высокоуровневый модуль: бизнес-логика задачи.
 * <p>
 * Что показываем: главный тезис принципа инверсии зависимостей (DIP, «D» из SOLID).
 * Модуль верхнего уровня {@code Job} зависит только от абстракций —
 * {@link DataBaseProvider} и {@link Messenger}, — а не от конкретных классов SQLDB/OracleDB/Email.
 * Конкретные реализации подставляются снаружи через конструктор (constructor injection).
 * <p>
 * Для чего нужно: чтобы заменить SQLDB на OracleDB или Email на SMS, достаточно поменять
 * одну строку в фабрике {@code Manager} — сам класс {@code Job} трогать не придётся.
 * В юнит-тестах вместо реальной БД легко подставить заглушку (mock).
 */
public class Job implements Task {

    private String name;
    private Person person;

    // Зависимости от абстракций. Какая именно реализация спрятана за интерфейсом — Job не знает.
    private final DataBaseProvider dataBase;
    private final Messenger messenger;

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

    /**
     * Сохраняет отработанные часы через абстракцию {@link DataBaseProvider}.
     * Никаких {@code new SQLDB()} здесь нет — используется та реализация, которую подставил Manager.
     */
    public void updateDB(int hours) {
        dataBase.update(String.format("Updated DB of %s with %s hours", this.person.getName(), hours));
    }

    /**
     * Отправляет уведомление через абстракцию {@link Messenger}.
     * Подменить канал доставки (email, sms, ...) можно не трогая этот код.
     */
    public void sendMessage() {
        messenger.send(String.format("Send to %s", person.getName()));
    }

}
