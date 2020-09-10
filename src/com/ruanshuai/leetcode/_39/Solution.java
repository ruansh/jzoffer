package com.ruanshuai.leetcode._39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ruanshuai_sx
 * @date 2020/9/9
 */

class Solution {
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        int i = 0;
        int j = candidates.length;
        while (i < j) {
            int m = candidates[i];
            int n = candidates[j];
            if (m == target) {
                lists.add(new ArrayList<>(m));
                i++;
            }
            if (n == target) {
                lists.add(new ArrayList<>(n));
                j++;
            }
            if (m + candidates[j] == target) {
                lists.add(Arrays.asList(m, n));
                i++;
                j--;
            } else if (m+ n < target) {
                i++;
            } else {
                j--;
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{}, 7));

    }
}
