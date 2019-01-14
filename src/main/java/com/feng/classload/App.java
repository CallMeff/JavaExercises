package com.feng.classload;

/**
 * @desc：
 * @title：App
 * @author: tianfengluyao
 * @date: 2019/1/10 9:29
 */
public class App {
    public static void main(String[] args) {
        new Son();
        System.out.println("father/son都已加载后******************");
        new Son();
    }
}
