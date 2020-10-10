package com.ruanshuai.test;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/9/28
 */

public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.size());
            for (int j = i + 1; j < list.size(); j++) {
                System.out.println(list.size());
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
