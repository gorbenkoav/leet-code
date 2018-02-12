package ag.leetcode.problems.math;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class MostWaterContainer {

    public int maxArea(int[] height) {
        int start = 0;
        int finish = height.length - 1;
        int max = 0;
        while (start < finish) {
            max = Math.max(max, Math.min(height[start], height[finish]) * (finish - start));
            if (height[start] < height[finish]) {
                start++;
            } else {
                finish--;
            }
        }
        return max;
    }
}
