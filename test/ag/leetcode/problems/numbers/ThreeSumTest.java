package ag.leetcode.problems.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {
        ThreeSum sum = new ThreeSum();

        assertEquals(1, sum.threeSum(new int[]{0, 0, 0}).size());
        assertEquals(2, sum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).size());
    }
}