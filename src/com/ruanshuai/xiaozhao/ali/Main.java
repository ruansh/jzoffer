package com.ruanshuai.xiaozhao.ali;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/8/28
 */

public class Main {

    public static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String str = String.valueOf(n);
        perm(str.toCharArray(), 0, str.length() - 1);
        int count = 0;
        for (Integer num : set) {
            if (num % m == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void perm(char[] chars, int start, int end) {
        if (start == end) {
            set.add(Integer.valueOf(String.valueOf(chars)));
        } else {
            for (int i = start; i <= end; i++) {
                swap(chars, start, i);
                perm(chars, start + 1, end);
                swap(chars, start, i);
            }
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

    }
}
