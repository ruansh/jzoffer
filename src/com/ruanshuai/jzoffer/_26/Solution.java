package com.ruanshuai.b._26;

import com.ruanshuai.jzoffer.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/7/26
 */

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null)
            return pRootOfTree;
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;
        while (p != null && p.right != null)
            p = p.right;
        if (left != null) {
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right != null) {
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return left != null ? left : pRootOfTree;
    }
}
