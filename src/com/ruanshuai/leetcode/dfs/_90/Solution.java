package com.ruanshuai.leetcode.dfs._90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            helper(nums, i, 0, path, lists);
        }
        return new ArrayList<>(new HashSet<>(lists));
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
        System.out.println(solution.subsetsWithDup(new int[]{4, 4, 4, 1, 4}));
    }
}