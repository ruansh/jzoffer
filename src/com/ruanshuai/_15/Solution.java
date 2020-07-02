package com.ruanshuai._15;

import com.ruanshuai.ds.ListNode;

import java.util.Stack;

/**
 * @author ruanshuai
 * @date 2020/7/2
 */

public class Solution {

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        ListNode temp = new ListNode(-1);
        ListNode pre = temp;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
        return pre.next;
    }
}
