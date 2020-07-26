package com.ruanshuai.a._01;

/**
 * @author ruanshuai
 * @date 2020/6/10
 */

public class Solution {
    public boolean Find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length;
        int cols = array[0].length;
        int i = rows - 1;
        int j = 0;
        while (i >= 0 && j <= cols - 1) {
            if (array[i][j] < target)
                j++;
            else if (array[i][j] > target)
                i--;
            else
                return true;
        }
        return false;
    }
}