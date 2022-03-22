package com.github.panarik.javaLesson.work.leetcode;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeNumberTest {

    @DataProvider(name = "numbers")
    public Object[][] numbers(){
        return new Object[][]{{12350, false}, {131, true}, {10, false}, {0, true}};
    }

    @Test(dataProvider = "numbers")
    public void palindromeNumberTest(int number, boolean isPalindrom) {
        Assert.assertEquals(new PalindromeNumber().isPalindrome(number), isPalindrom);
    }

}