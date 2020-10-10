package com.ruanshuai.leetcode.tree._145;

import com.ruanshuai.jzoffer.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        return list;
    }

    public void helper(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        helper(list, root.left);
        helper(list, root.right);
        list.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.right = b;
        b.left = c;
        List<Integer> res = new Solution().postorderTraversal(a);
        System.out.println(res);
    }
}
