package com.ruanshuai._55;

import com.ruanshuai.ds.ListNode;

/**
 * @author ruanshuai
 * @date 2020/7/5
 */

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                fast = pHead;
                while (fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                if (slow == fast)
                    return slow;
            }
        }
        return null;
    }
}