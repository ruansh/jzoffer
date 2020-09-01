package com.ruanshuai.xiaozhao.meituan._02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/8/29
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        List<Integer> res = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            pre.add(i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cur = array[i][j];
                if (pre.contains(cur)) {
                    res.add(cur);
                    pre.remove(pre.indexOf(cur));
                    break;
                }
            }
        }
        for (Integer num : res) {
            System.out.println(num);
        }
    }
}
