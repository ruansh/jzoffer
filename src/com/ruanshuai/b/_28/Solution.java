package com.ruanshuai.b._28;

import java.util.HashMap;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        for (int i : map.keySet())
            if (map.get(i) > array.length / 2)
                return i;
        return 0;
    }
}