package com.ruanshuai.b._30;

/**
 * @author ruanshuai
 * @date 2020/7/20
 */

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int max = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            res = Math.max(max, res);
        }
        return res;
    }
}
