package com.github.panarik.javaLesson.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CalculatorTest {

    Calculator calc;

    @BeforeAll
    static void initGlobal() {
        System.out.println("Global before all");
    }

    @BeforeEach
    void init() {
        System.out.println("init test");
        calc = new Calculator();
    }

    @Test
    @DisplayName("add() testing")
    void add() {
        Assertions.assertEquals(22, calc.add(10, 12));
    }

    @CsvSource({
            "2,2,4",
            "2,6,8",
            "10,20,30",
            "-5,5,0",
    })
    @ParameterizedTest
    void csvAddTest(int a, int b, int result) {
        Assertions.assertEquals(result, calc.add(a, b));
    }

    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/calculatorTest.csv")
    @CsvFileSource(files = {"src/test/resources/calculatorTest.csv", "src/test/resources/calculatorTest2.csv"})
    void csvFileAddTest(int a, int b, int result) {
        Assertions.assertEquals(result, calc.add(a, b));
    }


    @ParameterizedTest
    @MethodSource("generateCases")
    void methodAddTest(int a, int b, int result) {
        Assertions.assertEquals(result, calc.add(a, b));
    }

    public static Stream<Arguments> generateCases() {
        List<Arguments> list = new ArrayList<>();
        for (int i = 0; i<100; i++) {
            int a = (int)(Math.random() * 100);
            int b = (int)(Math.random() * 100);
            int result = a+b;
            list.add(Arguments.arguments(a,b,result));
        }
        return list.stream();
    }


    @Test
    @Disabled
    void div() {
        Assertions.assertEquals(5, calc.div(10, 2), "does not work div()");
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(5, 0), "don't throw ArithmeticException");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Global after all");
    }

}
