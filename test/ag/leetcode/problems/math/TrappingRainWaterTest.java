package ag.leetcode.problems.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void trap() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        assertEquals(1, trappingRainWater.trap(new int[]{4, 2, 3}));
        assertEquals(1, trappingRainWater.trap(new int[]{3, 2, 4}));
        assertEquals(0, trappingRainWater.trap(new int[]{1, 2, 2, 3}));
        assertEquals(0, trappingRainWater.trap(new int[]{3, 3, 1, 1, 0}));
        assertEquals(0, trappingRainWater.trap(new int[]{3, 3, 3, 3}));
        assertEquals(1, trappingRainWater.trap(new int[]{3, 3, 2, 3}));
        assertEquals(6, trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}