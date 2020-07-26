package com.ruanshuai.d._67;

/**
 * @author ruanshuai
 * @date 2020/7/26
 */

public class Solution {
    public int cutRope(int target) {
        if (target < 2)
            return 0;
        if (target == 2)
            return 1;
        if (target == 3)
            return 2;
        int timeof3 = target / 3;
        if (target - (3 * timeof3) == 1)
            timeof3 -= 1;
        int timeof2 = (target - 3 * timeof3) / 2;
        return (int) (Math.pow(3, timeof3) * Math.pow(2, timeof2));
    }
}