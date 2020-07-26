package com.ruanshuai.a._03;

import com.ruanshuai.ds.ListNode;

import java.util.ArrayList;

/**
 * @author ruanshuai
 * @date 2020/6/17
 */

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> integerList = new ArrayList<>();
        if (listNode == null) {
            return integerList;
        }
        ListNode curNode = listNode;
        while (curNode != null) {
            integerList.add(0, curNode.val);
            curNode = curNode.next;
        }
        return integerList;
    }
}