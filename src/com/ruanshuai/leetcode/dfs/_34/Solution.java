package com.ruanshuai.leetcode.dfs._34;

import com.ruanshuai.jzoffer.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        List<Integer> path = new ArrayList<>();
        helper(lists, path, root, sum);
        return lists;
    }

    public void helper(List<List<Integer>> lists, List<Integer> path, TreeNode root, int sum) {
        path.add(root.val);
        sum = sum - root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            lists.add(new ArrayList<>(path));
            return;
        }
        if (root.left != null) {
            helper(lists, path, root.left, sum);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            helper(lists, path, root.right, sum);
            path.remove(path.size() - 1);
        }
    }
}