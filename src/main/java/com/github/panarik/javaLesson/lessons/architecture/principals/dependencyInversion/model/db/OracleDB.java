package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db;

/**
 * Альтернативная низкоуровневая деталь: ещё одна реализация {@code DataBaseProvider}.
 * <p>
 * Что показываем: главный выигрыш DIP. Чтобы «переехать» с SQL на Oracle,
 * достаточно в {@code Manager.createDataBase()} вернуть {@code new OracleDB()}.
 * Класс {@code Job} при этом не меняется ни на символ.
 * <p>
 * Для чего нужно: убедиться, что абстракция действительно отделяет бизнес-логику
 * от деталей хранения.
 */
public class OracleDB implements DataBaseProvider {

    public void update(String text) {
        System.out.println(String.format("ORACLE: %s", text));
    }

}
