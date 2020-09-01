package com.ruanshuai.xiaozhao.meituan._04;

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
        int m = in.nextInt();
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int count = 0;
        for (int l = 1; l <= m; l++) {
            for (int r = l; r <= m; r++) {
                List<Integer> temp = new ArrayList<>();
                for (Integer num : list) {
                    if ((num > 0 && num < l) || (num > r && num < m + 1)) {
                        temp.add(num);
                    }
                }
                if (isIncreased(temp)) {
                    count += m - r + 1;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isIncreased(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
