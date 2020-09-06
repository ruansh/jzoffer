package com.ruanshuai.xiaozhao.tencent._02;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/9/6
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < x; j++) {
                list.add(in.nextInt());
            }
            lists.add(list);
        }
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (List<Integer> list : lists) {
                if (list.contains(0)) {
                    res.addAll(list);
                } else if (res.size() != 0) {
                    for (Integer num : res) {
                        if (list.contains(num)) {
                            res.addAll(list);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(res.size());
    }
}
