package com.ruanshuai._22;

import com.ruanshuai.ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ruanshuai
 * @date 2020/7/4
 */

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            list.add(treeNode.val);
            if (treeNode.left != null)
                queue.add(treeNode.left);
            if (treeNode.right != null)
                queue.add(treeNode.right);
        }
        return list;
    }
}
