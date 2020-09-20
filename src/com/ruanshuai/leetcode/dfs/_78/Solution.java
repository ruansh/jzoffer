package com.ruanshuai.leetcode.dfs._78;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            helper(nums, i, 0, path, lists);
        }
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
        System.out.println(solution.subsets(new int[]{1, 2, 3}));
    }
}