package com.ruanshuai.test;


/**
 * @author ruanshuai
 * @date 2020/9/5
 */

public class thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我是线程" + this.getId());
        }
    }

    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread1 th2 = new thread1();
        th1.start();
        th2.start();
    }
}
