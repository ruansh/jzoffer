package com.ruanshuai.leetcode.dp.easy._0801;

/**
 * @author ruanshuai
 * @date 2020/9/10
 */

class Solution {
    public int waysToStep(int n) {
        if (n < 1)
            return 0;
        else if (n < 2)
            return 1;
        else if (n < 3)
            return 2;
        else if (n < 4)
            return 4;
        int[] dp = new int[n + 1];
        int mod = 1000000007;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < n + 1; i++) {
            dp[i] = ((dp[i - 1] % mod + dp[i - 2] % mod) % mod + dp[i - 3] % mod) % mod;
        }
        return dp[n];
    }
}