package com.feng.thread;

/**
 * @desc：普通线程
 * @title：PublicThread
 * @author: tianfengluyao
 * @date: 2019/2/13 11:46
 */
public class PublicThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            //休眠30秒
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
