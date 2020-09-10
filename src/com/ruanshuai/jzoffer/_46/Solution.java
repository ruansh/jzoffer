package com.ruanshuai.jzoffer._46;

/**
 * @author ruanshuai
 * @date 2020/7/21
 */

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (m == 0 || n == 0)
            return -1;
        if (m == 1)
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }
}
