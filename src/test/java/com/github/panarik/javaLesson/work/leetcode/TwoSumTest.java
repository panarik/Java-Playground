package com.github.panarik.javaLesson.work.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    @Test
    public void returnSumOne() {
        int[] given = {2, 7, 11, 15};
        int[] result = {0, 1};
        Assertions.assertEquals(Arrays.toString(TwoSum.twoSum(given, 9)), Arrays.toString(result));
    }

    @Test
    public void returnSumTwo() {
        int[] given = {3, 2, 4};
        int[] result = {1, 2};
        Assertions.assertEquals(Arrays.toString(TwoSum.twoSum(given, 6)), Arrays.toString(result));
    }

    @Test
    public void returnSumThree() {
        int[] given = {3, 3};
        int[] result = {0, 1};
        Assertions.assertEquals(Arrays.toString(TwoSum.twoSum(given, 6)), Arrays.toString(result));
    }

}