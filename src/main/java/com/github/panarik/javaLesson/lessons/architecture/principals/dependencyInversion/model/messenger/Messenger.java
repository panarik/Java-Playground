package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger;

/**
 * Абстракция отправки уведомлений.
 * <p>
 * Что показываем: вторая зависимость {@code Job}, тоже спрятанная за интерфейсом.
 * Бизнес-логика говорит «отправь сообщение», не уточняя канал.
 * <p>
 * Для чего нужно: тот же приём, что и с {@code DataBaseProvider} — канал доставки
 * (email, sms, push) подменяется одной строкой в фабрике {@code Manager}.
 */
public interface Messenger {

    void send(String text);

}
