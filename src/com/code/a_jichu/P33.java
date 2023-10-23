package com.code.a_jichu;
//运算符-07-自增自减运算符-基本使用
public class P33 {
    //单独使用，无论放在变量前还是后，只要单独占一行，结果一样
    public static void main(String[] args) {
        int a=10;
        int b=a++;   //先用后加
        System.out.println(a);
        System.out.println(b);

        int c=20;
        int d=++c;   //先加后用
        System.out.println(c);
        System.out.println(d);
    }
}
