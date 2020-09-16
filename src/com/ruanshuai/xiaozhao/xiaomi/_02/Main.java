package com.ruanshuai.xiaozhao.xiaomi._02;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/9/15
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        System.out.println(sb.toString());
    }
}
