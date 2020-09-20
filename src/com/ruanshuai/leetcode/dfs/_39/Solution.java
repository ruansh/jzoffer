package com.ruanshuai.leetcode.dfs._39;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target < 0)
            return lists;
        List<Integer> path = new ArrayList<>();
        helper(candidates, target, lists, path, 0);
        return lists;
    }

    public void helper(int[] nums, int target, List<List<Integer>> lists, List<Integer> path, int begin) {
        if (target == 0) {
            lists.add(new ArrayList<>(path));
        } else if (target > 0) {
            for (int i = begin; i < nums.length; i++) {
                path.add(nums[i]);
                helper(nums, target - nums[i], lists, path, i);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(lists);
    }
}