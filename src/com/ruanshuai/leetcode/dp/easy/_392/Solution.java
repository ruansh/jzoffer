package com.ruanshuai.leetcode.dp.easy._392;

/**
 * @author ruanshuai
 * @date 2020/9/10
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength == 0)
            return true;
        if (sLength > tLength)
            return false;
        int count = 0;
        for (int i = 0; i < tLength; i++) {
            if (t.charAt(i) == s.charAt(count)) {
                count++;
            }
            if (count == sLength) {
                return true;
            }
        }
        return false;
    }
}