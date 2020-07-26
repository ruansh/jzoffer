package com.ruanshuai.a._18;

import com.ruanshuai.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/7/2
 */

public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}