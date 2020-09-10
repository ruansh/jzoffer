package com.ruanshuai.jzoffer._12;

/**
 * @author ruanshuai
 * @date 2020/6/18
 */

public class Solution {
    public double Power(double base, int exponent) {
        double res = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            if (exponent >= 0)
                res *= base;
            else
                res /= base;
        }
        return res;
    }
}
