package com.feng.theme.Multithreading;

/**
 * @desc: 类锁——.class形式
 * @author: TTfly
 * @create: 2019/1/10 21:02
 */
public class SynchronizedClassLockOfClass implements Runnable{

    static SynchronizedClassLockOfClass instance1 = new SynchronizedClassLockOfClass();
    static SynchronizedClassLockOfClass instance2 = new SynchronizedClassLockOfClass();

    @Override
    public void run() {
        method();
    }

    void method(){
        synchronized(this.getClass()) {
            System.out.println("我是静态方法" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();t2.start();
        while (t1.isAlive() || t2.isAlive()){
        }
    }
}
 