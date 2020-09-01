package com.ruanshuai.xiaozhao.pdd;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/8/2
 */

public class pdd3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int t = in.nextInt();
        if (t == 0) {
            System.out.println(0);
            return;
        }
        int res = Integer.MAX_VALUE;
        int[][] a1 = new int[n][2];
        int[][] a2 = new int[m][2];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            a1[i][0] = a;
            a1[i][1] = b;
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            a2[i][0] = a;
            a2[i][1] = b;
        }

        for (int i = 0; i < n; i++) {
            if (a1[i][1] >= t) {
                res = Math.min(res, a1[i][0]);
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (a2[j][1] >= t) {
                    res = Math.min(res, a2[j][0]);
                    continue;
                }
                if (a1[i][1] + a2[j][1] >= t) {
                    res = Math.min(res, a1[i][0] + a2[j][0]);
                }
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }
        System.out.println(res);
    }
}
