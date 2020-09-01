package com.ruanshuai.xiaozhao.pdd;

import java.util.Scanner;

/**
 * @author ruanshuai
 * @date 2020/7/23
 */

public class pdd1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if (k < 0 || k > 600)
            return;
        int n = in.nextInt();
        if (n < 1 || n > 100)
            return;
        int count = 0;
        int diff = k;
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            diff = diff - temp;
            if (diff == 0) {
                System.out.println("paradox");
                return;
            } else if (diff > 0)
                continue;
            else {
                diff = diff * -1;
                count += 1;
            }
        }
        System.out.print(diff + " " + count);
    }
}
