package ag.leetcode.problems.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    @Test
    void combinationSum() {
        CombinationSum combinationSum = new CombinationSum();
        assertEquals(2, combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7).size());
    }
}