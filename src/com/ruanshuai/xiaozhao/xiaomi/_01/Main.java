package com.ruanshuai.xiaozhao.xiaomi._01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ruanshuai_sx
 * @date 2020/9/15
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add(in.nextLine());
        for (String str : list) {
            System.out.println(match(str));
        }
    }

    public static boolean match(String str) {
        if (str == null || str.equals(""))
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.empty() && stack.peek() == '(')
                        stack.pop();
                    break;
                case ']':
                    if (!stack.empty() && stack.peek() == '[')
                        stack.pop();
                    break;
                case '}':
                    if (!stack.empty() && stack.peek() == '{')
                        stack.pop();
                    break;
                default:
                    return false;
            }
        }
        return stack.empty();
    }
}
