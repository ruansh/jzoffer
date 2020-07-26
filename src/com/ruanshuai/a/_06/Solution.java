package com.ruanshuai.a._06;

/**
 * @author ruanshuai
 * @date 2020/6/18
 */

public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int i = 0;
        int j = array.length - 1;
        int min = array[j];
        while (array[i] >= array[j]) {
            if (j - i == 1) {
                min = array[j];
                break;
            }
            int mid = i + (j - i) / 2;
            if (array[mid] >= array[i]) {
                i = mid;
            } else if (array[mid] <= array[j]) {
                j = mid;
            }
            if (array[mid] == array[i] && array[mid] == array[j]) {
                min = getMin(array, i, j);
            }
        }
        return min;
    }

    private int getMin(int[] array, int i, int j) {
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            min = Math.min(array[k], min);
        }
        return min;
    }

}
