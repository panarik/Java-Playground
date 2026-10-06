package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db;

/**
 * Абстракция хранилища данных.
 * <p>
 * Что показываем: именно такая абстракция «переворачивает» зависимость.
 * Высокоуровневая логика ({@code Job}) зависит от этого интерфейса,
 * а конкретные БД ({@code SQLDB}, {@code OracleDB}) — от него же.
 * <p>
 * Для чего нужно: добавить новую БД — значит написать ещё один класс с этим
 * интерфейсом. Бизнес-логику при этом менять не нужно.
 */
public interface DataBaseProvider {

    void update(String text);

}
