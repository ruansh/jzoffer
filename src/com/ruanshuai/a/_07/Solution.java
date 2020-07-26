package com.ruanshuai.a._07;

/**
 * @author ruanshuai
 * @date 2020/6/18
 */

public class Solution {
    public int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
