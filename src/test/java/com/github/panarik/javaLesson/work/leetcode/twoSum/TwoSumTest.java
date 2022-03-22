package com.github.panarik.javaLesson.work.leetcode.twoSum;

import com.github.panarik.javaLesson.work.leetcode.TwoSum;
import com.github.panarik.javaLesson.work.leetcode.twoSum.data.NumsData;
import com.github.panarik.javaLesson.work.leetcode.twoSum.data.ResultData;
import com.github.panarik.javaLesson.work.leetcode.twoSum.data.TwoSumData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

class TwoSumTest {

    static NumsData nums = new NumsData();
    static ResultData result = new ResultData();

    @DataProvider(name = "sums")
    public static Object[][] getNums() {
        return new Object[][] {
                {new TwoSumData(nums, 9, result)}
        };
    }

    @Test
    void returnSumOne() {
        int[] given = {2, 7, 11, 15};
        int[] result = {0, 1};
        int[] resultMethod = TwoSum.twoSum(given, 9);
        boolean resultTest = twoSumEqual(resultMethod, result);
        System.out.println("Expected: " + Arrays.toString(result) + ", result: " + Arrays.toString(resultMethod));
        Assert.assertTrue(resultTest, "Expected: " + Arrays.toString(result) + ", but found: " + Arrays.toString(resultMethod));
    }

    @Test
    public void returnSumTwo() {
        int[] given = {3, 2, 4};
        int[] result = {2, 4};
        int[] resultMethod = TwoSum.twoSum(given, 6);
        boolean resultTest = twoSumEqual(resultMethod, result);
        System.out.println("Expected: " + Arrays.toString(result) + ", result: " + Arrays.toString(resultMethod));
        Assert.assertTrue(resultTest, "Expected: " + Arrays.toString(result) + ", but found: " + Arrays.toString(resultMethod));
    }

    @Test
    public void returnSumThree() {
        int[] given = {3, 3};
        int[] result = {0, 1};
        int[] resultMethod = TwoSum.twoSum(given, 6);
        boolean resultTest = twoSumEqual(resultMethod, result);
        System.out.println("Expected: " + Arrays.toString(result) + ", result: " + Arrays.toString(resultMethod));
        Assert.assertTrue(resultTest, "Expected: " + Arrays.toString(result) + ", but found: " + Arrays.toString(resultMethod));
    }

    private boolean twoSumEqual(int[] first, int[] second) {
        return (first[0] == second[0] & first[1] == second[1] | first[0] == second[1] & first[1] == second[0]);
    }

}