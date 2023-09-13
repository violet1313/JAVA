package com.code.c_practice;

//要求：判断101~200之间有多少个素数，并输出所有素数

public class P74_text_2 {
    public static void main(String[] args) {
        int t=0;   //计数器，计算有多少个质数
        //外循环--遍历101~200这个范围，依次得到这个范围之内的每个数字
        for (int i = 101; i <=200 ; i++) {
            boolean flag=true;
            //内循环：判断是否为质数
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    flag=false;
                    t++;
                    break;
                }
            }
            //输出（每个数都判断输出一次）
            if(flag){
                System.out.println(i+"是质数");
            }else {
                System.out.println(i+"不是质数");
            }
        }
        System.out.println("总共有"+t+"个质数");
    }
}

   //判断质数
   /* int i=10;  //输入的质数
    boolean flag=true;
        for (int j = 2; j < i ; j++) {
        if(i%j==0){
        flag=false;
        break;
        }
        }
        if(flag){
        System.out.println("是质数");
        }else {
        System.out.println("不是质数");
        }
    */