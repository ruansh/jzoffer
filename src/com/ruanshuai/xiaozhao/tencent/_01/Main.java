package com.ruanshuai.xiaozhao.tencent._01;

import java.util.Scanner;

/**
 * @author ruanshuai_sx
 * @date 2020/9/6
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node a = new Node(-1);
        Node pre1 = a;
        Node b = new Node(-1);
        Node pre2 = b;

        for (int i = 0; i < n; i++) {
            a.next = new Node(in.nextInt());
            a = a.next;
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            b.next = new Node(in.nextInt());
            b = b.next;
        }
        printCommon(pre1.next, pre2.next);
    }

    public static void printCommon(Node h1, Node h2) {
        while (h1 != null && h2 != null) {
            if (h1.value > h2.value) {
                h1 = h1.next;
            } else if (h1.value < h2.value) {
                h2 = h2.next;
            } else {
                System.out.print(h1.value + " ");
                h1 = h1.next;
                h2 = h2.next;
            }
        }
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
