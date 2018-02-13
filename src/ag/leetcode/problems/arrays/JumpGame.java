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

        if (nums[index] > 0) {
            for (int i = index + 1; i < index + nums[index] + 1 && i < nums.length; i++) {
                if (jump(i, nums)) {
                    return true;
                }
            }
        }

        return false;
    }
}