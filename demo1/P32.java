package com.itheima.demo1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P32 {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int t=a>b ? a:b;
        int max=t>c ? t:c;

        System.out.println(max);
    }*/

    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%10==7 || i/10%10==7 || i%7==0){
                System.out.println("过");
                continue;
            }
    }

    }













}
