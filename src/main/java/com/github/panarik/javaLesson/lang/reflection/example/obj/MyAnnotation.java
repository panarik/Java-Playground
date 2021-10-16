package com.github.panarik.javaLesson.lang.reflection.example.obj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //исполняется во время работы программы
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD}) //где доступна аннотация
public @interface MyAnnotation {
    String value();
}
