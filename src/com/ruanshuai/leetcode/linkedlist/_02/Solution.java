package com.ruanshuai.leetcode.linkedlist._02;

import com.ruanshuai.jzoffer.ds.ListNode;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = p1 != null ? p1.val : 0;
            int y = p2 != null ? p2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (carry > 0) {
            cur.next = new ListNode(1);
        }
        return res.next;
    }
}
