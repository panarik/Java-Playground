package com.github.panarik.javaLesson.work.season3.work37;

public class Application {

    public Application() {
    }

    @MyTest
    private void method1(){
        System.out.println("method-1");
    }

    @MyTest
    private void method2(){
        System.out.println("method-2");
    }

    @MyTest
    private void method3(){
        System.out.println("method-3");
    }

    @BeforeMySuite
    @MyTest
    private void method4(){
        System.out.println("method-4");
    }

    @AfterMySuite
    @MyTest
    private void method5(){
        System.out.println("method-5");
    }

}
