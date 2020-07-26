package com.ruanshuai.a._20;

import java.util.Stack;

/**
 * @author ruanshuai
 * @date 2020/7/4
 */

public class Solution {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public void pop() {
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        while (!stack1.isEmpty()) {
            min = Math.min(min, stack1.peek());
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return min;
    }
}
