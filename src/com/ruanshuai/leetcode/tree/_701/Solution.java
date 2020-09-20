package com.ruanshuai.leetcode.tree._701;

import com.ruanshuai.jzoffer.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        TreeNode cur = root;
        while (cur != null) {
            TreeNode pre = cur;
            if (cur.val > val) {
                cur = cur.left;
                if (cur == null) {
                    pre.left = new TreeNode(val);
                }
            } else {
                cur = cur.right;
                if (cur == null) {
                    pre.right = new TreeNode(val);
                }
            }
        }
        return root;
    }
}