package com.ruanshuai.leetcode.dp.easy._303;

/**
 * @author ruanshuai
 * @date 2020/9/10
 */

class NumArray {

    int[] dp;

    public NumArray(int[] nums) {
        if (nums.length == 0)
            return;
        int n = nums.length;
        dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return dp[j];
        return dp[j] - dp[i - 1];
    }

}