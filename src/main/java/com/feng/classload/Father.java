package com.feng.classload;

/**
 * @desc：
 * @title：Father
 * @author: tianfengluyao
 * @date: 2019/1/10 9:28
 */
public class Father {

    private static int i = 1;

    static {
        System.out.println("father static space:"+i);
    }

    {
        System.out.println("father actual space:"+i);
    }

    public static void staticMethod(){
        System.out.println("father static method:"+i);
    }

    public Father() {
        System.out.println("father:"+i);
    }
}
