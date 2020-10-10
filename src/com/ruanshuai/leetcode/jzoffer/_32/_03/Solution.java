package com.ruanshuai.leetcode.jzoffer._32._03;

import com.ruanshuai.jzoffer.ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ruanshuai_sx
 * @date 2020/9/28
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode temp = queue.poll();
                if (lists.size() % 2 != 1)
                    list.add(temp.val);
                else
                    list.add(0, temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(4);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        List<List<Integer>> lists = s.levelOrder(a);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }
}
