package com.ruanshuai._32;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {

    public int GetUglyNumber_Solution(int index) {
        if (index < 1)
            return 0;
        int[] array = new int[index];
        array[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < index; i++) {
            int min = min(array[index2] * 2, array[index3] * 3, array[index5] * 5);
            array[i] = min;
            while (array[i] == array[index2] * 2)
                index2++;
            while (array[i] == array[index3] * 3)
                index3++;
            while (array[i] == array[index5] * 5)
                index5++;
        }
        return array[index - 1];
    }

    public int min(int a, int b, int c) {
        int res = Math.min(a, b);
        return Math.min(res, c);
    }

}