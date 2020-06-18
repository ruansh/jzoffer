package com.ruanshuai._04;

import com.ruanshuai.ds.TreeNode;

/**
 * @author ruanshuai
 * @date 2020/6/17
 */

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                treeNode.left = reConstructBinaryTree(pre, startPre + 1, startPre + i, in, startIn, i - 1);
                treeNode.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
            }
        }
        return treeNode;
    }
}
