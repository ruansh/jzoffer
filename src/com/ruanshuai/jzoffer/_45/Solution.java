package com.ruanshuai.jzoffer._45;

import java.util.*;

/**
 * @author ruanshuai
 * @date 2020/7/21
 */

public class Solution {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return false;
        Arrays.sort(numbers);
        int zeroCount = 0;
        int diff = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
                continue;
            }
            if (numbers[i] == numbers[i + 1])
                return false;
            diff += numbers[i + 1] - numbers[i] - 1;
        }
        return diff <= zeroCount;
    }
}
