package com.ruanshuai.leetcode.dfs._47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        func(nums, path, res, used);
        res = new ArrayList<>(new HashSet<>(res));
        return res;
    }

    public void func(int[] nums, List<Integer> path, List<List<Integer>> res, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                func(nums, path, res, used);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 3};
        List<List<Integer>> lists = solution.permuteUnique(nums);
        System.out.println(lists.toString());
    }
}