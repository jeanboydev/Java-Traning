package com.jeanboy.traning;

import com.jeanboy.traning.thread.MyThread;

public class Test {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getName() + "==getPriority==" + Thread.currentThread().getPriority() + "============线程开始创建=================");
        MyThread myThread = new MyThread();
        System.out.println(Thread.currentThread().getName() + "==getPriority==" + Thread.currentThread().getPriority() + "============线程已创建=================");
        myThread.start();
        System.out.println(Thread.currentThread().getName() + "==getPriority==" + Thread.currentThread().getPriority() + "============线程已开始=================");
        try {
            Thread.sleep(1000);
            myThread.interrupt();
            myThread.setDaemon(true);//将 myThread 设为 this 当前线程的守护线程
//            myThread.stop();
//            myThread.suspend();
//            myThread.resume();
            System.out.println(Thread.currentThread().getName() + "==getPriority==" + Thread.currentThread().getPriority() + "============线程执行完毕=================");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
