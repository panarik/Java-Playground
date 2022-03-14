package com.github.panarik.javaLesson.lessons.lang.values.links;

public class ToString {

    public static void main(String[] args) {


        //1 вариант
        MyClass one = new MyClass("Vaska");
        System.out.println("MyClass object field is - "+one);

        //2 вариант
        MyClass one2 = new MyClass("Vaska");
        System.out.println("MyClass object field is - " + one2.toString());

        //3 вариант
        MyClass one3 = new MyClass("Vaska");
        String one3Text = one3.toString();
        System.out.println("MyClass object field is - " + one3Text);



    }




    private static class MyClass {

        public MyClass(String vaska) {
        }
    }
}
