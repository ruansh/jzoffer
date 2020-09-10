package com.ruanshuai.b._24;

import com.ruanshuai.jzoffer.ds.TreeNode;

import java.util.ArrayList;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return lists;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            lists.add(new ArrayList<>(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size() - 1);
        return lists;
    }
}
