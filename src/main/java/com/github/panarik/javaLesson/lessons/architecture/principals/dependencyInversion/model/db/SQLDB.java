package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db;

/**
 * Низкоуровневая деталь: конкретная реализация БД (SQL).
 * <p>
 * Что показываем: реализацию {@code DataBaseProvider}, которая вместо настоящей записи
 * в базу просто печатает сообщение в консоль — так пример запускается без инфраструктуры.
 * <p>
 * Для чего нужно: показать, что выбор реализации делается не в бизнес-логике,
 * а в фабрике {@code Manager}.
 */
public class SQLDB implements DataBaseProvider {

    public void update(String text) {
        System.out.println(String.format("SQL: %s", text));
    }

}
