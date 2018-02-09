package ag.leetcode.problems.numbers;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{0,1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{0,2}, twoSum.twoSum(new int[]{-3,4,3,90}, 0));
    }
}