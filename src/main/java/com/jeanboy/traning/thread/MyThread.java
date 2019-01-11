package com.jeanboy.traning.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (this.isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + "====被中断了！！！");
                return;
            }
            System.out.println(Thread.currentThread().getName()+"==getPriority=="+Thread.currentThread().getPriority() + "====执行中===" + i);
        }
        System.out.println(Thread.currentThread().getName() + "====执行结束===");
    }
}
