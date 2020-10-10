package com.ruanshuai.leetcode.array._448;

import java.util.*;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                list.add(i+1);
            }
        }
        return list;
    }
}
