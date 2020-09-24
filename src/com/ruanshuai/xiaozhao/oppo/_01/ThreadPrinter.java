package com.ruanshuai.xiaozhao.oppo._01;

/**
 * @author ruanshuai_sx
 * @date 2020/9/23
 */

public class ThreadPrinter implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    public ThreadPrinter(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = Integer.MAX_VALUE;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    self.notifyAll();
                }
                try {
                    prev.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadPrinter ta = new ThreadPrinter("A", c, a);
        ThreadPrinter tb = new ThreadPrinter("B", a, b);
        ThreadPrinter tc = new ThreadPrinter("C", b, c);
        new Thread(ta).start();
        Thread.sleep(1);
        new Thread(tb).start();
        Thread.sleep(1);
        new Thread(tc).start();
        Thread.sleep(1);

    }
}
