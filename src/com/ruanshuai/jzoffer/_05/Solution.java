package com.ruanshuai.jzoffer._05;

import java.util.Stack;

/**
 * @author ruanshuai
 * @date 2020/6/18
 */

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        System.out.println(solution.pop());
        solution.push(3);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
    }
}
