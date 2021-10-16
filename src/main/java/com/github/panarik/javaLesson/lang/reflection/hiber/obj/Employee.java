package com.github.panarik.javaLesson.lang.reflection.hiber.obj;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String email;
    private String phone;
    private String address;

    public Employee(int id, String name, int age, int salary, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
