package com.ruanshuai._21;

import java.util.Stack;

/**
 * @author ruanshuai
 * @date 2020/7/4
 */

public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null)
            return false;
        if (pushA.length != popA.length)
            return false;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushA) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popA[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}