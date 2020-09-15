package com.ruanshuai.leetcode.dp.easy._53;

/**
 * @author ruanshuai_sx
 * @date 2020/9/9
 * 最大子序和
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
