package com.ruanshuai.leetcode.dfs._40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target < 0)
            return lists;
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];
        helper(candidates, target, lists, path, 0, used);
        return new ArrayList<>(new HashSet<>(lists));
    }

    public void helper(int[] nums, int target, List<List<Integer>> lists, List<Integer> path, int begin, boolean[] used) {
        if (target == 0) {
            lists.add(new ArrayList<>(path));
        } else if (target > 0) {
            for (int i = begin; i < nums.length; i++) {
                if (!used[i]) {
                    path.add(nums[i]);
                    used[i] = true;
                    helper(nums, target - nums[i], lists, path, i + 1, used);
                    path.remove(path.size() - 1);
                    used[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        System.out.println(lists);
    }
}