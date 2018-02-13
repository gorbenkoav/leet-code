package ag.leetcode.problems.arrays;

/**
 * https://leetcode.com/problems/jump-game/description/
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        loop:
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = 1; j <= i ; j++) {
                    if (nums[i-j] > j) {
                        continue loop;
                    }
                }
                return false;
            }
        }

        return true;
    }

}