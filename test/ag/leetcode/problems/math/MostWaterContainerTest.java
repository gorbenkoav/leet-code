package ag.leetcode.problems.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostWaterContainerTest {

    @Test
    void maxArea() {
        MostWaterContainer container = new MostWaterContainer();

        assertEquals(36, container.maxArea(new int[]{2, 3, 10, 5, 7, 8, 9}));
        assertEquals(4, container.maxArea(new int[]{1, 2, 4, 3}));
        assertEquals(4, container.maxArea(new int[]{4, 5}));
        assertEquals(2, container.maxArea(new int[]{1, 2, 1}));
    }
}