package com.ruanshuai.leetcode.tree._543;

import com.ruanshuai.jzoffer.ds.TreeNode;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    int res;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return res;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = helper(root.left);
        int r = helper(root.right);
        res = Math.max(res, l + r);
        return Math.max(l, r) + 1;
    }
}
