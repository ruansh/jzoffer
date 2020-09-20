package com.ruanshuai.leetcode.dfs._46;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        List<Integer> path = new ArrayList<>();
        func(nums, path, res);
        return res;
    }

    public void func(int[] nums, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i]))
                continue;
            path.add(nums[i]);
            func(nums, path, res);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.permute(new int[]{1, 2, 3});
    }
}