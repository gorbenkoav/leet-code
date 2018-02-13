package ag.leetcode.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    void canJump() {
        JumpGame game = new JumpGame();

        assertFalse(game.canJump(new int[]{3, 2, 1, 0, 4}));
        assertTrue(game.canJump(new int[]{2, 3, 1, 1, 4}));

        assertTrue(game.canJump(new int[]{2, 5, 0, 0}));
        assertTrue(game.canJump(new int[]{2, 0}));
        assertTrue(game.canJump(new int[]{2, 3, 1, 3, 4}));
    }
}