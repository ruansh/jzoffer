package com.ruanshuai.c._42;

import java.util.ArrayList;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == sum - array[j]) {
                    list.add(array[i]);
                    list.add(array[j]);
                    list.add(array[i] * array[j]);
                }
            }
            if (!list.isEmpty())
                lists.add(list);
        }
        if (lists.size() == 0)
            return new ArrayList<Integer>();
        int mult = Integer.MAX_VALUE;
        for (ArrayList<Integer> list : lists) {
            mult = Math.min(mult, list.get(list.size() - 1));
        }
        for (ArrayList<Integer> list : lists) {
            if (mult == list.get(list.size() - 1)) {
                list.remove(list.size() - 1);
                return list;
            }
        }
        return new ArrayList<Integer>();
    }
}
