package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task;

import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;

/**
 * Абстракция задачи.
 * <p>
 * Что показываем: интерфейс, через который {@code StartUI} управляет бизнес-логикой,
 * не зная о классе {@code Job} и о том, какие БД и мессенджер тот использует.
 * <p>
 * Для чего нужно: абстракция фиксирует контракт «что делает задача», оставляя
 * «как именно» на усмотрение реализаций.
 */
public interface Task {

    void setName(String name);

    void setPerson(Person person);

    void updateDB(int hours);

    void sendMessage();

}
