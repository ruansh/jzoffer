package com.ruanshuai.xiaozhao.meituan._05;

import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/8/29
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
            B[i] = -1;
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int temp = in.nextInt();
            if (temp == 1) {
                int k = in.nextInt();
                int x = in.nextInt();
                int y = in.nextInt();
                copyA2B(A, B, k, x, y);
            }
            if (temp == 2) {
                int index = in.nextInt();
                queryB(B, index);
            }
        }
    }

    public static void copyA2B(int[] A, int[] B, int k, int x, int y) {
        for (int i = 0; i < k; i++) {
            B[y + i - 1] = A[x + i - 1];
        }
    }

    public static void queryB(int[] B, int x) {
        System.out.println(B[x - 1]);
    }
}
