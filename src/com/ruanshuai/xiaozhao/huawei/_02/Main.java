package com.ruanshuai.xiaozhao.huawei._02;

import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/9/2
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] nums = str.split(",");
        int m = Integer.parseInt(nums[0]);
        int n = Integer.parseInt(nums[1]);
        char[][] chars = new char[m][n];
        for (int i = 0; i < m; i++) {
            chars[i] = in.next().toCharArray();
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                if (chars[i][j] == 'S') {
                    count++;
                }
            }
        }
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars[0].length - 1; j++) {
                if (chars[i][j] == 'S' && chars[i][j + 1] == 'S') {
                    count--;
                }
                if (chars[i][j] == 'S' && chars[i + 1][j] == 'S') {
                    count--;
                }
            }
        }
        System.out.println(count);
    }

}
