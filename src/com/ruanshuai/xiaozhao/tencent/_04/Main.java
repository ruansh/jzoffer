package com.ruanshuai.xiaozhao.tencent._04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/9/6
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    temp.add(list.get(j));
                }
            }
            Collections.sort(temp);
            System.out.println(temp.get((n - 1) / 2));
        }
    }

}
