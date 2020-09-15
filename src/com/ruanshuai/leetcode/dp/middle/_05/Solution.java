package com.ruanshuai.leetcode.dp.middle._05;

/**
 * @author ruanshuai
 * @date 2020/9/10
 */

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2)
            return s;
        int n = s.length();
        int maxLength = 1;
        String res = s.substring(0, 1);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j - i + 1 > maxLength && valid(s.substring(i, j + 1))) {
                    res = s.substring(i, j + 1);
                    maxLength = j - i + 1;
                }
            }
        }
        return res;
    }

    public boolean valid(String str) {
        if (str == null || str.length() < 2)
            return true;
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}