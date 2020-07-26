package com.ruanshuai.d._64;

import java.util.ArrayList;

/**
 * @author ruanshuai
 * @date 2020/7/7
 */

public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == null || size <= 0 || num.length < size)
            return list;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < num.length - size + 1; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = i; j < i + size; j++) {
                list1.add(num[j]);
            }
            lists.add(list1);
        }
        for (ArrayList<Integer> list1 : lists) {
            list.add(getMaxValue(list1));
        }
        return list;
    }

    public Integer getMaxValue(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer num : list) {
            max = Math.max(max, num);
        }
        return max;
    }
}