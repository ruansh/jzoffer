package com.ruanshuai.test;

import com.ruanshuai.jzoffer.ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ruanshuai_sx
 * @date 2020/9/28
 */

public class TestTree {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(4);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        for (Integer num : level(a)) {
            System.out.println(num);
        }
    }

    public static List<Integer> level(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (flag) {
                list.add(temp.val);
            } else {
                list.add(0, temp.val);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            flag = !flag;
        }
        return list;
    }
}
