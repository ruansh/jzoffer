package com.ruanshuai._17;

import com.ruanshuai.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/7/2
 */

public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val)
                flag = t1HasT2(root1, root2);
            if (!flag)
                flag = t1HasT2(root1.left, root2);
            if (!flag)
                flag = t1HasT2(root1.right, root2);
        }
        return flag;
    }

    public boolean t1HasT2(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return t1HasT2(root1.left, root2.left) && t1HasT2(root1.right, root2.right);
    }
}