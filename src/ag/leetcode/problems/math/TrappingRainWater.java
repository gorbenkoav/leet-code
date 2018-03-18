package ag.leetcode.problems.math;

/**
 * https://leetcode.com/problems/trapping-rain-water/description/
 */
public class TrappingRainWater {

    public int trap(int[] heights) {
        if (heights == null || heights.length < 3) {
            return 0;
        }

        int leftCursor = 0;
        int rightCursor = heights.length - 1;
        int leftBorderHeight = heights[leftCursor];
        int rightBorderHeight = heights[rightCursor];
        int volume = 0;
        while (leftCursor < rightCursor) {
            if (heights[leftCursor] < heights[rightCursor]) {
                leftCursor++;
                if (leftBorderHeight > heights[leftCursor]) {
                    volume += leftBorderHeight - heights[leftCursor];
                } else {
                    leftBorderHeight = heights[leftCursor];
                }
            } else {
                rightCursor--;
                if (rightBorderHeight > heights[rightCursor]) {
                    volume += rightBorderHeight - heights[rightCursor];
                } else {
                    rightBorderHeight = heights[rightCursor];
                }

            }
        }

        return volume;
    }

}
