package com.ruanshuai.b._27;

import java.util.*;

/**
 * @author ruanshuai
 * @date 2020/7/20
 */

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0)
            return list;
        char[] chars = str.toCharArray();
        function(list, chars, 0);
        Collections.sort(list);
        return list;
    }

    public void function(ArrayList<String> list, char[] chars, int start) {
        if (start == chars.length - 1) {
            if (!list.contains(String.valueOf(chars)))
                list.add(String.valueOf(chars));
        } else {
            for (int i = start; i < chars.length; i++) {
                swap(chars, i, start);
                function(list, chars, start + 1);
                swap(chars, i, start);
            }
        }
    }

    public void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}