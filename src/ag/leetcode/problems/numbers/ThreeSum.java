package ag.leetcode.problems.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/description/
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < length - 1; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int found = Arrays.binarySearch(nums, j + 1, length, -(nums[i] + nums[j]));
                        if (found > i && found > j) {
                            sums.add(Arrays.asList(nums[i], nums[j], nums[found]));
                        }
                    }
                }
            }
        }
        return sums;
    }
}
