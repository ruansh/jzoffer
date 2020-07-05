package com.ruanshuai._40;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length == 0)
            return;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : array) {
            if (!map.containsKey(value))
                map.put(value, 1);
            else
                map.put(value, map.get(value) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : array) {
            if (map.get(value) == 1) {
                list.add(value);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}