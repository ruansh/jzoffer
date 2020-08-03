package com.ruanshuai.d._66;

/**
 * @author ruanshuai
 * @date 2020/7/27
 */

public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold <= 0 || rows <= 0 || cols <= 0)
            return 0;
        boolean[][] array = new boolean[rows][cols];
        return helper(0, 0, rows, cols, array, threshold);
    }

    public int helper(int row, int col, int rows, int cols, boolean[][] array, int threshold) {
        int count = 0;
        if (toBeVisited(row, col, rows, cols, array, threshold)) {
            array[row][col] = true;
            count = 1 + helper(row + 1, col, rows, cols, array, threshold)
                    + helper(row - 1, col, rows, cols, array, threshold)
                    + helper(row, col + 1, rows, cols, array, threshold)
                    + helper(row, col - 1, rows, cols, array, threshold);
        }
        return count;
    }

    public boolean toBeVisited(int row, int col, int rows, int cols, boolean[][] array, int threshold) {
        return row >= 0 && row < rows && col >= 0 && col < cols && getSum(row) + getSum(col) <= threshold && !array[row][col];
    }

    public int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}