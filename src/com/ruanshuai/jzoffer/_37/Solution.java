package com.ruanshuai.b._37;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        int count = 0;
        for (int num : array) {
            if (num == k)
                count++;
        }
        return count;
    }
}
