package ag.leetcode.problems.arrays;

/**
 * https://leetcode.com/problems/rotate-image/description/
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length < 2) {
            return;
        }

        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length - i - 1; j++) {
                swap(matrix, i, j, matrix.length - 1 - i - j, i);
                swap(matrix, matrix.length - 1 - i - j, i, matrix.length - 1 - i, matrix.length - 1 - i - j);
                swap(matrix, matrix.length - 1 - i, matrix.length - 1 - i - j, j, matrix.length - 1 - i);
            }
        }

    }

    private final void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int swap = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = swap;
    }
}
