package com.ruanshuai.b._34;

import java.util.HashMap;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0 || str.length() > 10000)
            return -1;
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(chars[i]))
                map.put(chars[i], 1);
            else
                map.put(chars[i], map.get(chars[i]) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(chars[i]) == 1)
                return i;
        }
        return -1;
    }
}