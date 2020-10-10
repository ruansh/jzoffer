package com.ruanshuai.leetcode.jzoffer._32._01;

import com.ruanshuai.jzoffer.ds.TreeNode;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/9/28
 */

class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            list.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
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
        int[] res = s.levelOrder(a);
        System.out.println(Arrays.toString(res));
    }
}
