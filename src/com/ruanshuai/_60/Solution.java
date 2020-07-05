package com.ruanshuai._60;

import com.ruanshuai.ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null)
            return lists;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 1;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            list.add(cur.val);
            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
            start++;
            if (start == end) {
                end = queue.size();
                start = 0;
                lists.add(list);
                list = new ArrayList<>();
            }
        }
        return lists;
    }

}