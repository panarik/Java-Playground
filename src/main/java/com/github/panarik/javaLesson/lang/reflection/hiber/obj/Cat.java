package com.github.panarik.javaLesson.lang.reflection.hiber.obj;

import com.github.panarik.javaLesson.lang.reflection.hiber.HField;
import com.github.panarik.javaLesson.lang.reflection.hiber.Table;

@Table (name = "cats")
public class Cat {

        @HField
        private int id;

        @HField
        private String name;

        @HField
        private String color;

public Cat(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
        }

public int getId() {
        return id;
        }

public void setId(int id) {
        this.id = id;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public String getColor() {
        return color;
        }

public void setColor(String color) {
        this.color = color;
        }

@Override
public String toString() {
        return "Cat{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", color='" + color + '\'' +
        '}';
        }
        }
