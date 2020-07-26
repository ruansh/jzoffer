package com.ruanshuai.a._09;

/**
 * @author ruanshuai
 * @date 2020/6/18
 */

public class Solution {
    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }
}