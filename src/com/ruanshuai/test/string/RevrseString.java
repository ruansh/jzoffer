package com.ruanshuai.test.string;

/**
 * @author ruanshuai
 * @date 2020/9/20
 */

public class RevrseString {

    public static void main(String[] args) {
        String s = "sstrtktk";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String temp = s.substring(i, j + 1);
                if (func(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }

    public static boolean func(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
