package com.ruanshuai._29;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length == 0 || input.length < k)
            return list;
        Arrays.sort(input);
        int i = 0;
        for (int num : input) {
            if (!list.contains(num) && i < k) {
                list.add(num);
                i++;
            }
        }
        return list;
    }
}