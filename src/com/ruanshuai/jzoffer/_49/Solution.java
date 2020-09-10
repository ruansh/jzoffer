package com.ruanshuai.jzoffer._49;

/**
 * @author ruanshuai
 * @date 2020/7/26
 */

public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        char[] chars = str.toCharArray();
        int tag = 0;
        int sum = 0;
        if (chars[0] == '-')
            tag = 1;
        for (int i = tag; i < chars.length; i++) {
            if (chars[i] == '+')
                continue;
            int temp = chars[i] - '0';
            if (temp < 0 || temp > 9)
                return 0;
            sum = sum * 10 + temp;
        }
        return tag == 1 ? sum * -1 : sum;
    }
}
