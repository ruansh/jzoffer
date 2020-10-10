package com.ruanshuai.leetcode.tree._226;

import com.ruanshuai.jzoffer.ds.TreeNode;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
