package com.ruanshuai.xiaozhao.pdd;

import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/8/2
 */

public class pdd4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] a = new String[6][6];
        int res = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][i] = in.next();
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (a[i][j].equals("#")) {
                    if (i == 0) {
                        if (j == 0) {
                            res *= 6;
                        } else if (j == 5) {
                            if (a[i][j - 1].equals("#"))
                                res *= 5;
                            else
                                res *= 6;
                        } else {

                        }
                    }
                }
            }
        }

    }

    public static void compute(int a, int b) {
        switch (b) {
            case 0:
                a *= 6;
                break;
            case 1:
                a *= 5;
                break;
            case 2:
                a *= 4.2;
                break;
            case 3:
                a *= 22.25;
                break;
            case 4:
                a *= 2;
                break;
        }
    }
}
