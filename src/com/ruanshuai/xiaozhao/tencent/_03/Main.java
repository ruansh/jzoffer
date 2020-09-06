package com.ruanshuai.xiaozhao.tencent._03;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/9/6
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.next());
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        List<String> res = new ArrayList<>();
        for (String s : map.keySet()) {
            if (res.size() != 0 && map.get(res.get(res.size() - 1)) < map.get(s)) {
                res.add(0, s);
            } else {
                res.add(s);
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(res.get(i) + " " + map.get(res.get(i)));
        }
        for (int i = 0; i < k; i++) {
            System.out.println(res.get(i) + " " + map.get(res.get(i)));
        }
    }
}
