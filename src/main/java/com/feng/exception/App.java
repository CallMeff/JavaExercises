package com.feng.exception;

/**
 * @desc：客户端
 * @title：App
 * @author: tianfengluyao
 * @date: 2019/2/14 14:16
 */
public class App {


    public static void main(String[] args) {
        try{
            throw new CustomException();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
