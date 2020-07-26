package com.ruanshuai.b._32;

/**
 * @author ruanshuai
 * @date 2020/7/20
 */

public class Solution {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        int n = numbers.length;
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        sort(strings);
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    public void sort(String[] strings) {
        int n = strings.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((strings[j] + strings[j + 1]).compareTo(strings[j + 1] + strings[j]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
    }

}