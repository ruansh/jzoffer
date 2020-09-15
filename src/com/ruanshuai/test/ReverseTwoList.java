package com.ruanshuai.test;

/**
 * @author ruanshuai
 * @date 2020/9/10
 */

public class ReverseTwoList {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("before");
        print(n1);
        System.out.println("after");
        print(func(n1));
    }

    public static Node func(Node node) {

        Node pre = new Node(-1);
        pre.next = node;
        Node cur = pre;
        while (cur.next != null && cur.next.next != null) {
            Node first = cur.next;
            Node second = cur.next.next;
            Node third = cur.next.next.next;
            cur.next = second;
            second.next = first;
            first.next = third;
            cur = cur.next.next;
        }
        return pre.next;
    }

    public static void print(Node node) {
        Node cur = node;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
