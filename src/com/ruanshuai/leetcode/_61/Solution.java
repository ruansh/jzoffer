package com.ruanshuai.leetcode._61;

import java.util.Arrays;

/**
 * @author ruanshuai
 * @date 2020/9/7
 */

class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                int temp = nums[i + 1] - nums[i];
                if (temp == 0)
                    return false;
                else {
                    zeroCount = zeroCount - temp + 1;
                }
            }
        }
        return zeroCount >= 0;
    }
}
