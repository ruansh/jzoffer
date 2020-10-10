package com.ruanshuai.leetcode.string._14;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String min = strs[0];
        for (String str : strs) {
            while (!str.startsWith(min)) {
                min = min.substring(0, min.length() - 1);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"flow", "fl", "flo"};
        Solution s = new Solution();
        System.out.println(s.longestCommonPrefix(strings));
    }
}
