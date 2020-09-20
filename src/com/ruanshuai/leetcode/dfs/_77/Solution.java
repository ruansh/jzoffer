package com.ruanshuai.leetcode.dfs._77;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        if (n < 0 || k > n)
            return lists;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<Integer> path = new ArrayList<>();
        helper(nums, k, 0, path, lists);
        return lists;
    }

    public void helper(int[] nums, int k, int start, List<Integer> path, List<List<Integer>> lists) {
        if (k == 0) {
            lists.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            helper(nums, k - 1, i + 1, path, lists);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4, 2));
    }
}