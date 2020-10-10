package com.ruanshuai.leetcode.linkedlist._160;

import com.ruanshuai.jzoffer.ds.ListNode;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 * 求两个链表相交的起始节点
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            //错误的人终不相遇
            if (p1 == null && p2 == null) {
                return null;
            }
            //如果p1走到了终点，从p2的起点开始走
            if (p1 == null) {
                p1 = headB;
            }
            //如果p2走到了终点，从p1的起点开始走
            if (p2 == null) {
                p2 = headA;
            }
        }
        //对的人迟早相逢
        return p1;
    }
}
