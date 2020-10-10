package com.ruanshuai.leetcode.array._1343;

/**
 * @author ruanshuai_sx
 * @date 2020/9/28
 */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - k + 1; i++) {
            if (computeAvg(arr, i, i + k - 1) >= threshold) {
                count++;
            }
        }
        return count;
    }

    public int computeAvg(int[] nums, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }
        return sum / (j - i + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }
}
