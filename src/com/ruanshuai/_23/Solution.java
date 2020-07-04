package com.ruanshuai._23;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return VerifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    public boolean VerifySquenceOfBST(int[] sequence, int start, int end) {
        if (start >= end)
            return true;
        int root = sequence[end];
        int i = 0;
        while (i < end - 1) {
            if (sequence[i] > root)
                break;
            i++;
        }
        int j = i;
        while (j < end - 1) {
            if (sequence[j] < root)
                return false;
            j++;
        }
        return VerifySquenceOfBST(sequence, start, i - 1) && VerifySquenceOfBST(sequence, i, end - 1);
    }
}