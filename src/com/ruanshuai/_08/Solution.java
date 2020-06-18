package com.ruanshuai._08;

/**
 * @author ruanshuai
 * @date 2020/6/18
 */

public class Solution {
    public int JumpFloor(int target) {
        if (target < 3) {
            return target;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}