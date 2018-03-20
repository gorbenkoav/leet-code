package ag.leetcode.problems.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    @Test
    void rotate0DMatrix() {
        int[][] matrix0D = {};
        new RotateImage().rotate(matrix0D);
        assertTrue(Arrays.deepEquals(new int[][]{}, matrix0D));
    }

    @Test
    void rotate1DMatrix() {
        int[][] matrix1D = {{5}};
        new RotateImage().rotate(matrix1D);
        assertTrue(Arrays.deepEquals(new int[][]{{5}}, matrix1D));
    }

    @Test
    void rotate2DMatrix() {
        int[][] matrix2D = {
                {1, 2},
                {3, 4}};
        new RotateImage().rotate(matrix2D);

        int[][] matrix2DRotated = {
                {3, 1},
                {4, 2}};
        System.out.println(Arrays.deepToString(matrix2D));
        assertTrue(Arrays.deepEquals(matrix2DRotated, matrix2D));
    }

    @Test
    void rotate3DMatrix() {
        int[][] matrix3D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        new RotateImage().rotate(matrix3D);

        int[][] matrix3DRotated = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};
        System.out.println(Arrays.deepToString(matrix3D));
        assertTrue(Arrays.deepEquals(matrix3DRotated, matrix3D));
    }

    @Test
    void rotate4DMatrix() {
        int[][] matrix4D = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};
        new RotateImage().rotate(matrix4D);

        int[][] matrix4DRotated = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}};
        System.out.println(Arrays.deepToString(matrix4D));
        assertTrue(Arrays.deepEquals(matrix4DRotated, matrix4D));
    }

}