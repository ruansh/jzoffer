package com.ruanshuai.jzoffer._10;

/**
 * @author ruanshuai
 * @date 2020/6/18
 */

public class Solution {
    public int RectCover(int target) {
        if (target < 3)
            return target;
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
