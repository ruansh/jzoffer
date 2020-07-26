package com.ruanshuai.c._43;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() < 2 || n < 1)
            return str;
        return str.substring(n) + str.substring(0, n);
    }
}