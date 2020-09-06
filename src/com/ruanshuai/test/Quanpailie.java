package com.ruanshuai.test;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/9/3
 */

public class Quanpailie {

    public static Set<int[]> list = new HashSet<>();

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        prem(arr, 0, arr.length - 1);
        for (int[] a : list) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static void prem(int[] arr, int start, int end) {
        if (start == end) {
            list.add(arr.clone());
        } else {
            for (int i = start; i <= end; i++) {
                swap(arr, start, i);
                prem(arr, start + 1, end);
                swap(arr, start, i);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
