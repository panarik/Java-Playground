package com.github.panarik.javaLesson.season3.work6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    public void postFour_many_test() {
        int[] expected = {1, 7};
        int[] actual = solution.postFour(new int[]{1, 2, 4, 1, 2, 3, 4, 1, 7});
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void postFour_one_test() {
        int[] expected = {1, 2, 3, 0, -500, 7};
        int[] actual = solution.postFour(new int[]{1, 999999, 4, 1, 2, 3, 0, -500, 7});
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void postFour_last_test() {
        int[] expected = {};
        int[] actual = solution.postFour(new int[]{-500, 4});
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void postFour_none_test() {
        Assertions.assertThrows(RuntimeException.class, () -> solution.postFour(new int[]{0, 0}));
    }

    @Test
    public void postFour_noneZeroLength_test() {
        Assertions.assertThrows(RuntimeException.class, () -> solution.postFour(new int[]{}));
    }

    @Test
    public void postFour_oneOneLength_test() {
        int[] expected = {};
        int[] actual = solution.postFour(new int[]{4});
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void postFour_twoTwoLength_test() {
        int[] expected = {};
        int[] actual = solution.postFour(new int[]{4,4});
        Assertions.assertArrayEquals(expected, actual);
    }


}
