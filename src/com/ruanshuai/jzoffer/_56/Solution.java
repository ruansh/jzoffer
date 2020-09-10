package com.ruanshuai.jzoffer._56;

import com.ruanshuai.jzoffer.ds.ListNode;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode res = new ListNode(-1);
        ListNode cur = pHead;
        res.next = pHead;
        ListNode pre = res;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                int val = cur.val;
                while (cur != null && cur.val == val) {
                    cur = cur.next;
                }
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return res.next;
    }
}
