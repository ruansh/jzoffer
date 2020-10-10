package com.ruanshuai.test.thread;

/**
 * @author ruanshuai
 * @date 2020/9/25
 */

public class TestThread implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread  =new TestThread();
        new Thread(testThread).start();
        Thread.sleep(5000);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("线程运行");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
