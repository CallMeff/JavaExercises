package com.feng.classload;

/**
 * @desc：
 * @title：Son
 * @author: tianfengluyao
 * @date: 2019/1/10 9:29
 */
public class Son extends Father{

    private static int i = 1;

    static {
        System.out.println("son static space:"+i);
    }

    {
        System.out.println("son actual space:"+i);
    }

    public static void staticMethod(){
        System.out.println("son static method:"+i);
    }

    public Son() {
        System.out.println("son:"+i);
    }
}
