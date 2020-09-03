package com.ruanshuai.xiaozhao.huawei._03;

import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/9/2
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        int[][] c = new int[n][k];
        getMax(k, v, w);
    }

    public static void getMax(int m, int[] v, int[] w) {
        int n = v.length;
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 0; i <= m; i++) {
            arr[0][i] = 0;
        }
        for (int j = 0; j <= n; j++) {
            arr[j][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (w[i - 1] <= j) {
                    if (arr[i - 1][j] < arr[i - 1][j - w[i - 1]] + v[i - 1]) {
                        arr[i][j] = arr[i - 1][j - w[i - 1]] + v[i - 1];
                    } else {
                        arr[i][j] = arr[i - 1][j];
                    }
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        System.out.println(arr[n][m]);
    }
}
