package com.feng.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @desc：客户端
 * @title：App
 * @author: tianfengluyao
 * @date: 2019/2/13 11:46
 */
public class App {

    private static DateFormat sdf = new SimpleDateFormat("YYYY-mm-DD hh:MM:SS");

    public static void main(String[] args) {
        //创建N个线程
        int n = 1000;
        System.out.println(sdf.format(new Date())+ ":创建开始！");
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(new PublicThread());
            t.start();
        }

        System.out.println(sdf.format(new Date()) + ":创建完成！");
    }
}
