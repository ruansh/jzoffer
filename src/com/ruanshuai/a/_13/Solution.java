package com.ruanshuai.a._13;

/**
 * @author ruanshuai
 * @date 2020/6/19
 */

public class Solution {
    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] % 2 != 1 && array[j + 1] % 2 != 0)
                    swap(array, j, j + 1);
            }
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}