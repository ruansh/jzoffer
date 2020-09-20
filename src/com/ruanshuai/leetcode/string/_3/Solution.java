package com.ruanshuai.leetcode.string._3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int max = 1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (helper(s.substring(i, j + 1))) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public boolean helper(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                return false;
            } else {
                list.add(s.charAt(i));
            }
        }
        return true;
    }

}