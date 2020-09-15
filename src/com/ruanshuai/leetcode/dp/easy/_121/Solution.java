package com.ruanshuai.leetcode.dp.easy._121;

/**
 * @author ruanshuai_sx
 * @date 2020/9/9
 * 买卖股票，只能一次
 */

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        int min_price = prices[0];
        for (int i = 1; i < n; i++) {
            min_price = Math.min(min_price, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - min_price);
        }
        return dp[n - 1];
    }
}

//class Solution {
//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (prices[j] > prices[i]) {
//                    res = Math.max(res, prices[j] - prices[i]);
//                }
//            }
//        }
//        return res;
//    }
//}
