package ag.leetcode.problems.arrays;

/**
 * https://leetcode.com/problems/jump-game/description/
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        return jump(0, nums);
    }

    private boolean jump(int index, int[] nums) {
        if (index >= nums.length - 1) {
            return true;
        }

        // 2, 3, 1, 1, 4
        if (nums[index] > 0) {
            for (int i = nums[index]; i > 0; i--) {
                if (jump(i + index, nums)) {
                    return true;
                }
            }
        }

        return false;
    }
}