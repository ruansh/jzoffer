package com.ruanshuai.test;

import com.ruanshuai.jzoffer.ds.ListNode;

import java.util.Stack;

/**
 * @author ruanshuai
 * @date 2020/9/4
 * 使用栈实现
 */

public class ReverseList {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        printList(a);
        printList(reverse(a));
    }

    public static ListNode reverse(ListNode cur){
        Stack<ListNode> stack = new Stack<>();
        while (cur!= null){
            stack.push(cur);
            cur = cur.next;
        }
        ListNode head = new ListNode(-1);
        ListNode res = head;
        while (!stack.isEmpty()){
            ListNode temp  = stack.pop();
            temp.next=null;
            head.next = temp;
            head = head.next;
        }
        head.next = null;
        return res.next;
    }

    public static void printList(ListNode cur){
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
