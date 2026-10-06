package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.person;

/**
 * Конкретная реализация {@code Person}: штатный сотрудник.
 * <p>
 * Что показываем: низкоуровневый класс, зависящий от абстракции ({@code Person}),
 * а не наоборот — это вторая половина формулировки DIP («детали зависят от абстракций»).
 * <p>
 * Для чего нужно: создание Employee спрятано в {@code Manager}, поэтому добавить
 * новую реализацию (например, Contractor) можно, не меняя существующий код.
 */
public class Employee implements Person {

    private String name;
    private String email;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
