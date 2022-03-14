package com.github.panarik.javaLesson.lang.reflection.example;

import com.github.panarik.javaLesson.lang.reflection.example.obj.Cat;
import com.github.panarik.javaLesson.lang.reflection.example.obj.MyAnnotation;

import java.lang.reflect.*;

public class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Cat cat = new Cat("Barsik", "white", 2);

        Class catClass1 = cat.getClass();
        Class catClass2 = Class.forName("com.github.panarik.javaLesson.lang.reflection.example.obj.Cat");

        //class summary
        int modifiers = catClass1.getModifiers();
        System.out.println("class Cat modifiers: " + modifiers);
        System.out.println("class Cat is public: " + Modifier.isPublic(modifiers));
        System.out.println("class Cat is final:  " + Modifier.isFinal(modifiers));
        System.out.println("class Cat is static: " + Modifier.isStatic(modifiers));

        //class fields
        Field[] fields = catClass1.getFields(); //public fields
        for (Field field : fields) System.out.println(field);
        Field[] gecleredFields = catClass1.getDeclaredFields();
        for (Field field : gecleredFields) System.out.println(field);
        //get
        Field field = catClass1.getDeclaredField("name");
//        System.out.println(field.get(null)); //для статического объекта
        System.out.println(field.get(cat));
        //set access
        field.setAccessible(true);
        //set
        field.set(cat, "Murzic");
        System.out.println(field.get(cat));

        //class constructor
        Constructor[] constructors = catClass1.getDeclaredConstructors();
        for (Constructor constructor : constructors) System.out.println("class constructor: " + constructor);
        Constructor<Cat> catConstructor = catClass1.getConstructor(String.class, String.class, int.class);
        Cat reflector = catConstructor.newInstance("Reflector", "black", 100);
        System.out.println(reflector);
        Cat reflector2 = (Cat) catClass1.newInstance();
        System.out.println(reflector2);

        //class methods
        Method method = catClass1.getDeclaredMethod("run", int.class);
        method.setAccessible(true);
//        method.invoke(null, 100); //если статический сласс
        method.invoke(reflector, 100);

        Field[] fields1 = catClass1.getDeclaredFields();
        for (Field field1 : fields1) {
            field1.setAccessible(true);
            if (field1.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println(field1.get(cat));
                System.out.println(field1.getAnnotation(MyAnnotation.class).value());
            }
        }
    }
}
