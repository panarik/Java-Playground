package com.github.panarik.javaLesson.work.season3.work37;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

    public static void main(String[] args) {
        start(Application.class);
    }

    private static void start(Class c) {
        //get object
        Object object = null;
        Constructor[] constructors = c.getDeclaredConstructors();
        try {
            for (Constructor constructor : constructors) {
                object = constructor.newInstance();
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //run methods
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            try {
                //before
                if (method.isAnnotationPresent(BeforeMySuite.class)) {
                    method.setAccessible(true);
                    method.invoke(object, null);
                }
                //tests
                //ToDo: do tests

                //after
                //ToDo: do after
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

        }
    }

}
