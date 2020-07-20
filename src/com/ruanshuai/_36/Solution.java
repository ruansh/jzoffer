package com.ruanshuai._36;

import com.ruanshuai.ds.ListNode;

/**
 * @author ruanshuai
 * @date 2020/7/20
 */

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int m = getLength(pHead1);
        int n = getLength(pHead2);
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        if (m < n) {
            p1 = pHead2;
            p2 = pHead1;
        }
        for (int i = 0; i < Math.abs(m - n); i++) {
            p1 = p1.next;
        }
        while (p1 != null && p2 != null && p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public int getLength(ListNode node) {
        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }
}