package com.ruanshuai.test;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author ruanshuai
 * @date 2020/9/15
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{9, 5, 3, 7, 1};
        System.out.println(Arrays.toString(array));
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int x = array[i];
        while (i < j) {
            while (i < j && x <= array[j])
                j--;
            if (i < j)
                array[i++] = array[j];
            while (i < j && array[i] <= x)
                i++;
            if (i < j)
                array[j--] = array[i];
        }
        array[i] = x;
        sort(array, start, i - 1);
        sort(array, i + 1, end);

    }
}
