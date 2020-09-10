package com.ruanshuai.b._38;

import com.ruanshuai.jzoffer.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }
}
