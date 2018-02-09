package ag.leetcode.problems.numbers;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return new int[]{};
        }
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i]) && i != numbers.get(target - nums[i])) {
                return new int[]{i, numbers.get(target - nums[i])};
            }
        }
        return null;
    }
}
