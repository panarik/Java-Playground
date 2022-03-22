package com.github.panarik.javaLesson.testing;

import com.github.panarik.javaLesson.lessons.testing.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    Calculator calc;

    @BeforeTest
    static void initGlobal() {
        System.out.println("Global before all");
    }

    @BeforeMethod
    void init() {
        System.out.println("init test");
        calc = new Calculator();
    }

    @Test(testName = "add() testing")
    void add() {
        Assert.assertEquals(22, calc.add(10, 12));
    }

    @Test
    void div() {
        Assert.assertEquals(5, calc.div(10, 2), "does not work div()");
    }

    @AfterMethod
    void afterEach() {
        System.out.println("after test");
    }

    @AfterTest
    static void afterAll() {
        System.out.println("Global after all");
    }

}
