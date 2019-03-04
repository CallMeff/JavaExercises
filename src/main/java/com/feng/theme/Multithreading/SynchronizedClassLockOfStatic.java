package com.feng.theme.Multithreading;

/**
 * @desc: 类锁——static形式
 * @author: TTfly
 * @create: 2019/1/10 21:02
 */
public class SynchronizedClassLockOfStatic implements Runnable{

    static SynchronizedClassLockOfStatic instance1 = new SynchronizedClassLockOfStatic();
    static SynchronizedClassLockOfStatic instance2 = new SynchronizedClassLockOfStatic();

    @Override
    public void run() {
        method();
    }

    static synchronized void method(){
        System.out.println("我是静态方法" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();t2.start();
        while (t1.isAlive() || t2.isAlive()){
        }
    }
}
