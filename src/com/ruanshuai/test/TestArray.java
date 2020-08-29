package com.ruanshuai.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ruanshuai
 * @date 2020/8/29
 */

public class TestArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 2, 5, 6};
        List<Integer> list = new ArrayList<>();
        int sum = 4;
        int length = array.length;
        int i = 0;
        int j = length - 1;
        Arrays.sort(array);
        while (i < j) {
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                i++;
                j--;
            } else if (array[i] + array[j] > sum) {
                j--;
            } else {
                i++;
            }
        }
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
