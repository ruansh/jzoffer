package com.ruanshuai.leetcode.dp.easy._198;

/**
 * @author ruanshuai_sx
 * @date 2020/9/9
 * 打家劫舍，dp
 */

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }
}
