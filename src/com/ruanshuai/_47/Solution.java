package com.ruanshuai._47;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public int Sum_Solution(int n) {
        if (n == 1)
            return 1;
        return Sum_Solution(n - 1) + n;
    }
}