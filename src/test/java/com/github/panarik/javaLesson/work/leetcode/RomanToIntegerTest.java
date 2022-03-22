package com.github.panarik.javaLesson.work.leetcode;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RomanToIntegerTest {

    private RomanToInteger romans;

    @BeforeTest
    public void init() {
        romans = new RomanToInteger();
    }

    @DataProvider(name = "tens")
    public static Object[][] getTens() {
        return new Object[][]{{"I", 1}, {"III", 3}, {"IV", 4}, {"V", 5}, {"VIII", 8}};
    }

    @Test(dataProvider = "tens")
    public void testTens(String romanDigit, int digit) {
        Assert.assertEquals(romans.romanToInt(romanDigit), digit);
    }

}