package com.feng.finalTest;

/**
 * @desc：final用法测试
 * @title：FinalTest
 * @author: tianfengluyao
 * @date: 2019/2/15 14:25
 */
public class FinalTest {

    private int num;

    public FinalTest(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     * final修饰的变量值不允许修改
     * 那么：final修饰的变量A指向一个应用变量B，B的引用改变后，A的应用会改变吗？
     */
    public static void testFinal(){
        FinalTest b = new FinalTest(1);
        final FinalTest a =  b;
        System.out.println(a.num);
        b = new FinalTest(2);
        System.out.println(a.num);
    }

    /**
     * final修饰的变量值不允许修改
     * 那么：final修饰的变量A指向一个应用变量B，B的引用的对象改变后，A的应用会改变吗？
     */
    public static void testFinal2(){
        FinalTest b = new FinalTest(1);
        final FinalTest a =  b;
        System.out.println(a.num);
        b.setNum(2);
        System.out.println(a.num);
    }


    public static void main(String[] args) {
        FinalTest.testFinal2();
    }




}
