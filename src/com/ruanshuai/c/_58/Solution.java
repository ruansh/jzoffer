package com.ruanshuai.c._58;

import com.ruanshuai.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        TreeNode mirror = swapTreeNode(pRoot);
        return isMirror(pRoot, mirror);
    }

    boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val == root2.val)
            return isMirror(root1.left, root2.left) && isMirror(root1.right, root2.right);
        return false;
    }

    TreeNode swapTreeNode(TreeNode pRoot) {
        if (pRoot == null)
            return null;
        TreeNode temp = new TreeNode(pRoot.val);
        temp.left = swapTreeNode(pRoot.right);
        temp.right = swapTreeNode(pRoot.left);
        return temp;
    }
}