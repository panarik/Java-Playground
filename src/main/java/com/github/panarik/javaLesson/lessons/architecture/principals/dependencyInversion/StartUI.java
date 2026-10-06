package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion;

// Импорты
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.Manager;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Person;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task.Task;

// Лишние импорты
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person.Employee;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.messenger.Email;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db.SQLDB;
import com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.task.Job;





/**
 * Точка входа примера «Принцип инверсии зависимостей» (Dependency Inversion Principle, D из SOLID).
 * <p>
 * Суть принципа: модули верхнего уровня не должны зависеть от модулей нижнего уровня —
 * оба должны зависеть от абстракций (интерфейсов).
 * <p>
 * Что показываем: два варианта одного и того же сценария рядом.
 * <ol>
 *     <li>Правильный вариант: {@code Manager} собирает конкретные реализации ({@code SQLDB},
 *         {@code Email}), а {@code StartUI} и {@code Job} работают только с абстракциями.</li>
 *     <li>Негативный пример {@link #negativeExample()}: тот же сценарий, но клиентский код
 *         сам создаёт конкретные объекты и жёстко связывается с деталями реализации.</li>
 * </ol>
 * <p>
 * Для чего нужно: сравнить оба варианта и увидеть цену нарушения — в правильном варианте
 * подмена реализации (SQLDB на OracleDB, Email на SMS) делается одной строкой в {@code Manager},
 * в неправильном пришлось бы править каждый клиентский класс, где написан {@code new}.
 */
public class StartUI {

    public static void main(String[] args) {

        // --- Правильный вариант: зависимости собирает Manager. ---

        // Работаем с абстракцией Person, реализацию выбирает Manager.
        Person person = Manager.createPerson();
        person.setName("Jon Doe");
        person.setEmail("jon@mail.com");

        // Job получает зависимости (БД и мессенджер) снаружи через конструктор.
        Task job = Manager.createJob();
        job.setName("My Job");
        job.setPerson(person);
        job.updateDB(5);
        job.sendMessage();

        // --- Негативный пример: тот же сценарий, но без инверсии зависимостей. ---
        System.out.println("\nНегативный пример: клиент сам создаёт конкретные объекты");
        negativeExample();
    }

    /**
     * Негативный пример: так делать не нужно.
     * <p>
     * Что показываем: что происходит без инверсии зависимостей. Клиентский код сам
     * создаёт конкретные объекты ({@code new Employee()}, {@code new SQLDB()}, {@code new Email()})
     * и напрямую зависит от деталей реализации. Заметьте: уже сами импорты конкретных
     * классов в начале файла — признак нарушения.
     * <p>
     * Для чего нужно: увидеть цену такого подхода:
     * <ul>
     *     <li>знание о конкретных классах размножается по всем клиентам, вместо того чтобы
     *         жить в одном месте — {@code Manager};</li>
     *     <li>подмена реализации (SQLDB на OracleDB) требует найти и исправить каждый такой
     *         {@code new} во всей кодовой базе;</li>
     *     <li>в тестах нельзя подставить заглушку — связи зашиты жёстко.</li>
     * </ul>
     * Правильный вариант этого же кода — метод {@link #main(String[])}.
     */
    private static void negativeExample() {

        // Клиент жёстко привязан к конкретному классу Employee, а не к абстракции Person.
        Employee person = new Employee();
        person.setName("Jon Doe");
        person.setEmail("jon@mail.com");

        // Клиент сам собирает граф зависимостей и решает, какая БД и какой мессенджер будут работать.
        Job job = new Job(new SQLDB(), new Email());
        job.setName("My Job");
        job.setPerson(person);
        job.updateDB(5);
        job.sendMessage();
    }

}
