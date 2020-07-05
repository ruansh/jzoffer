package com.ruanshuai._31;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {

    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        if (n <= 0)
            return count;
        for (int i = 1; i <= n; i++) {
            count += countOne(String.valueOf(i));
        }
        return count;
    }

    public int countOne(String num) {
        int count = 0;
        char[] characters = num.toCharArray();
        for (char c : characters)
            if (c == '1')
                count++;
        return count;
    }
}