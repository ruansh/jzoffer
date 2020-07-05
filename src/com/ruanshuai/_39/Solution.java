package com.ruanshuai._39;

import com.ruanshuai.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;
        if (Math.abs(queryDeepth(root.left) - queryDeepth(root.right)) > 1)
            return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int queryDeepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return Math.max(queryDeepth(root.left), queryDeepth(root.right)) + 1;
    }
}
