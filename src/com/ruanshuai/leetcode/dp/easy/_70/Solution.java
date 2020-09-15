package com.ruanshuai.leetcode.dp.easy._70;

/**
 * @author ruanshuai_sx
 * @date 2020/9/9
 * 爬楼梯
 */

class Solution {
    public int climbStairs(int n) {
        if (n < 1)
            return 0;
        if (n < 3)
            return n;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}

