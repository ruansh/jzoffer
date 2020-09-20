package com.ruanshuai.leetcode.tree._783;

import com.ruanshuai.jzoffer.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public Integer pre;
    public Integer min;

    public int minDiffInBST(TreeNode root) {
        if (root == null)
            return 0;
        min = Integer.MAX_VALUE;
        pre = null;
        helper(root);
        return min;
    }

    public void helper(TreeNode root) {
        if (root == null)
            return;
        helper(root.left);
        if (pre != null) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        helper(root.right);
    }
}