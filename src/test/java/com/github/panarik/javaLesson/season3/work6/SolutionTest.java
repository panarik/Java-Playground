package com.github.panarik.javaLesson.season3.work6;

import com.github.panarik.javaLesson.work.season3.work6.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    Solution solution;

    public void init() {
        solution = new Solution();
    }

    @Test
    public void postFour_many_test() {
        int[] expected = {1, 7};
        int[] actual = solution.postFour(new int[]{1, 2, 4, 1, 2, 3, 4, 1, 7});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void postFour_one_test() {
        int[] expected = {1, 2, 3, 0, -500, 7};
        int[] actual = solution.postFour(new int[]{1, 999999, 4, 1, 2, 3, 0, -500, 7});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void postFour_last_test() {
        int[] expected = {};
        int[] actual = solution.postFour(new int[]{-500, 4});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void postFour_none_test() {
        Assert.assertThrows(RuntimeException.class, () -> solution.postFour(new int[]{0, 0}));
    }

    @Test
    public void postFour_noneZeroLength_test() {
        Assert.assertThrows(RuntimeException.class, () -> solution.postFour(new int[]{}));
    }

    @Test
    public void postFour_oneOneLength_test() {
        int[] expected = {};
        int[] actual = solution.postFour(new int[]{4});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void postFour_twoTwoLength_test() {
        int[] expected = {};
        int[] actual = solution.postFour(new int[]{4,4});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isOneOrFour_fourOneLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {4}));
    }

    @Test
    public void isOneOrFour_fourLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {4,900,-500000,1,0,0,-1,5,8,90}));
    }

    @Test
    public void isOneOrFour_fourManyLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {4,900,-500000,4,0,0,0,1,-1,4,8,90}));
    }

    @Test
    public void isOneOrFour_fourLeftsideLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {0,900,-500000,70,0,0,0,8,-1,5,8,4}));
    }

    @Test
    public void isOneOrFour_fourRightsideLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {4,900,-500000,70,0,0,0,8,-1,5,8,1}));
    }

    @Test
    public void isOneOrFour_oneOneLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {1}));
    }

    @Test
    public void isOneOrFour_oneLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {1,900,-500000,0,0,0,-1,5,8,90}));
    }

    @Test
    public void isOneOrFour_oneManyLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {1,900,-500000,1,0,0,0,1,-1,5,8,90}));
    }

    @Test
    public void isOneOrFour_oneLeftsideLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {1,900,-500000,70,0,0,0,8,-1,5,8,90}));
    }

    @Test
    public void isOneOrFour_oneRightsideLargeLength_test() {
        Assert.assertTrue(solution.isOneOrFour(new int[] {7,900,-500000,70,0,0,0,8,-1,5,8,1}));
    }

    @Test
    public void isOneOrFour_NONE_test() {
        Assert.assertFalse(solution.isOneOrFour(new int[] {7,900,-500000,70,0,0,0,8,-1,5,8,0}));
    }


}
