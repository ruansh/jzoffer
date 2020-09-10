package com.ruanshuai.jzoffer._44;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public String ReverseSentence(String str) {
        if (str == null)
            return null;
        if (str.trim().equals(""))
            return str;
        String[] chars = str.split(" ");
        String[] res = new String[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            res[chars.length - i - 1] = chars[i];
        }
        return String.join(" ", res);
    }
}
