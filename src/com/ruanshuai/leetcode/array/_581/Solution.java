package com.ruanshuai.leetcode.array._581;

import java.util.Arrays;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, n);
        Arrays.sort(temp);
        int start = n - 1;
        int end = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != temp[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        return start < end ? end - start + 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}
