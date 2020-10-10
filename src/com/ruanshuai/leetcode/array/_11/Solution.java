package com.ruanshuai.leetcode.array._11;

/**
 * @author ruanshuai_sx
 * @date 2020/9/30
 */

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max((j - i) * Math.min(height[i], height[j]), res);
            }
        }
        return res;
    }
}
