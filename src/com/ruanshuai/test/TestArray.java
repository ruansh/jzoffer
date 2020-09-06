package com.ruanshuai.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/8/29
 */

public class TestArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
