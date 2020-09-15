package com.ruanshuai.leetcode.dp.middle._322;

import java.util.Arrays;

/**
 * @author ruanshuai
 * @date 2020/9/10
 */

class Solution {

    public int coinChange(int[] coins, int amount) {
        if (amount <= 0)
            return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}