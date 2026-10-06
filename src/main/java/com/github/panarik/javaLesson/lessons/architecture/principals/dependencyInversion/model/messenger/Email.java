package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger;

/**
 * Низкоуровневая деталь: уведомления по email.
 * <p>
 * Что показываем: реализацию {@code Messenger}, которая вместо реальной отправки
 * печатает сообщение в консоль.
 * <p>
 * Для чего нужно: в связке с {@code SQLDB} показывает типичную пару зависимостей,
 * которую высокоуровневый модуль получает снаружи через конструктор.
 */
public class Email implements Messenger {

    public void send(String text) {
        System.out.println("EMAIL: " + text);
    }

}
