package com.ruanshuai.leetcode.jzoffer._11;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int m = i + (j - i) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minArray(new int[]{3, 4, 5, 6, 1, 2}));
    }
}
