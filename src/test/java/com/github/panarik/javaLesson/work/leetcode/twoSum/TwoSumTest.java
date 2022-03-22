package com.github.panarik.javaLesson.work.leetcode.twoSum;

import com.github.panarik.javaLesson.work.leetcode.TwoSum;
import com.github.panarik.javaLesson.work.leetcode.twoSum.data.TwoSumData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSumTest {


    @DataProvider(name = "sums")
    public static Object[][] getNums() {
        return new Object[][]{
                {new TwoSumData(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1})},
                {new TwoSumData(new int[]{3, 2, 4}, 6, new int[]{1, 2})},
                {new TwoSumData(new int[]{3, 3}, 6, new int[]{0, 1})},
                {new TwoSumData(new int[]{0, 4, 3, 0}, 0, new int[]{0, 3})},
                {new TwoSumData(new int[]{0, 3, 0}, 0, new int[]{0, 2})},
        };
    }

    @Test(dataProvider = "sums")
    void returnSumOne(TwoSumData data) {
        int[] resultMethod = TwoSum.twoSum(data.nums, data.target);
        boolean resultTest = twoSumEqual(resultMethod, data.result);
        System.out.println("Expected: " + Arrays.toString(data.result) + ", result: " + Arrays.toString(resultMethod));
        Assert.assertTrue(resultTest, "Expected: " + Arrays.toString(data.result) + ", but found: " + Arrays.toString(resultMethod));
    }

    private boolean twoSumEqual(int[] first, int[] second) {
        return (first[0] == second[0] & first[1] == second[1] | first[0] == second[1] & first[1] == second[0]);
    }

}