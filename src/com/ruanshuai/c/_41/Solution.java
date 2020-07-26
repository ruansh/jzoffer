package com.ruanshuai.c._41;

import java.util.ArrayList;

/**
 * @author ruanshuai
 * @date 2020/7/21
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (sum < 3)
            return lists;
        int p = 1;
        int q = 2;
        while (q > p) {
            int curSum = (p + q) * (q - p + 1) / 2;
            if (curSum < sum) {
                q++;
            } else if (curSum > sum) {
                p++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = p; i <= q; i++) {
                    list.add(i);
                }
                lists.add(list);
                p++;
            }
        }
        return lists;
    }
}
