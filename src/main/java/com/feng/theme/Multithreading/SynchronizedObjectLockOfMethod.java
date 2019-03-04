package com.feng.theme.Multithreading;

/**
 * @desc: 对象锁——方法形式
 * @author: TTfly
 * @create: 2019/1/10 20:46
 */
public class SynchronizedObjectLockOfMethod implements Runnable {

    static SynchronizedObjectLockOfMethod instance = new SynchronizedObjectLockOfMethod();

    Object lock1 = new Object();
    Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();t2.start();
        while (t1.isAlive() || t2.isAlive()){

        }

    }

    public synchronized void method(){
        System.out.println("我是对象锁的方法修饰符形式，我叫：" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    @Override
    public void run() {
        method();
    }
}
