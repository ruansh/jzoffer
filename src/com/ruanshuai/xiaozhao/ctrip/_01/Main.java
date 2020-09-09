package com.ruanshuai.xiaozhao.ctrip._01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/9/8
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sensitive = in.nextLine();
        String words = in.nextLine();
        String replace = in.nextLine();
        int n = sensitive.length();
        for (int i = 0; i < words.length() - n; i++) {
            String temp = words.substring(i, i + n);
            if (words.charAt(i) != ',' && words.charAt(i) != ' ' && match(temp, sensitive)) {
                words = words.replaceAll(temp, replace);
                i += n - 1;
            }
        }
        System.out.println(words);
    }

    public static boolean match(String a, String b) {
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        return Arrays.toString(ac).equals(Arrays.toString(bc));
    }
}
