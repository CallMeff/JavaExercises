package com.feng.theme.Multithreading;

/**
 * @author: TTfly
 * @create: 2019/1/10 20:12
 */
public class DisappearRequestOne implements Runnable{

    static DisappearRequestOne instance = new DisappearRequestOne();
    //统计数I
    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        //新建两个线程
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            i++;
        }
    }
}
