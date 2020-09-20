package com.ruanshuai.leetcode._32;

import java.util.Stack;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public int longestValidParentheses(String s) {
        int res = 0;
        if (s == null || s.equals(""))
            return res;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (helper(s.substring(i, j + 1)))
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    public boolean helper(String str) {
        if (str == null || str.equals(""))
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.helper(")"));
    }
}