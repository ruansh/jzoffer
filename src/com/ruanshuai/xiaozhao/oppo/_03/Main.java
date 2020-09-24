package com.ruanshuai.xiaozhao.oppo._03;

/**
 * @author ruanshuai_sx
 * @date 2020/9/23
 */

public class Main {

    public void func(String str) {
        int n = str.length();
        if (n <= 1) {
            System.out.println(str);
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String temp = str.substring(i, j + 1);
                if (helper(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }

    public boolean helper(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        new Main().func("woppocom");
    }
}
