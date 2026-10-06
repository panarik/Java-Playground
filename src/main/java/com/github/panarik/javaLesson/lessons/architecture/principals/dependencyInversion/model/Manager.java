package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model;

import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.DataBaseProvider;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.SQLDB;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Email;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Messenger;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Employee;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task.Job;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task.Task;

/**
 * Фабрика (composition root): единственное место в примере, где упоминаются конкретные классы.
 * <p>
 * Что показываем: DIP не означает, что оператор {@code new} запрещён совсем.
 * Он означает, что создание конкретных реализаций должно быть собрано в одном месте,
 * а бизнес-логика ({@code Job}) — зависеть только от абстракций.
 * <p>
 * Для чего нужно: весь «граф зависимостей» собирается здесь. Хотим OracleDB вместо SQLDB
 * или SMS вместо Email — меняем ровно одну строку в этом классе, остальной код не трогаем.
 */
public class Manager {

    public static Person createPerson() {
        return new Employee();
    }

    public static Task createJob() {
        Messenger messenger = createMessenger();
        DataBaseProvider dataBase = createDataBase();
        // Job получает реализации снаружи и не знает, что это именно SQLDB и Email.
        return new Job(dataBase, messenger);
    }

    private static Messenger createMessenger() {
        return new Email();
    }

    private static DataBaseProvider createDataBase() {
        return new SQLDB();
    }

}
