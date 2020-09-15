package com.ruanshuai.test;

/**
 * @author ruanshuai
 * @date 2020/9/11
 */

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i - 1]);
            dp[i] = prices[i] > min ? Math.max(prices[i] - min, dp[i - 1]) : dp[i - 1];
        }
        return dp[n - 1];
    }
}