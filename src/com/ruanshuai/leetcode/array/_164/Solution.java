package com.ruanshuai.leetcode.array._164;

import java.util.Arrays;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = nums[1] - nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i + 1] - nums[i]);
        }
        return max;
    }
}
