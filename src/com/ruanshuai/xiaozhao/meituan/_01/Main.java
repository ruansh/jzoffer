package com.ruanshuai.xiaozhao.meituan._01;

import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/8/29
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String T = in.next();
//        int n = 10;
//        String T = "MMATSATMMT";
        int start = getStart(T, n);
        int end = getEnd(T, n);
        if(start != -1 && end != -1)
            System.out.println(T.substring(start + 1, end));
    }

    public static int getStart(String T, int n) {
        boolean hasM = false;
        for (int i = 0; i < n; i++) {
            char curChar = T.charAt(i);
            if (curChar == 'M') {
                hasM = true;
            }
            if (hasM && curChar == 'T') {
                return i;
            }
        }
        return -1;
    }

    public static int getEnd(String T, int n) {
        boolean hasT = false;
        for (int i = n - 1; i >= 0; i--) {
            char curChar = T.charAt(i);
            if (curChar == 'T') {
                hasT = true;
            }
            if (hasT && curChar == 'M')
                return i;
        }
        return -1;
    }
}
