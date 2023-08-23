package com.itheima.demo1;

import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=number; i++){
            if(i*i==number) {
                System.out.println(i + "就是" + number + "的平方根");
                break;
            }
            else if (i*i>number){
                System.out.println((i-1)+"是"+number+"平方根的整数部分");
                break;
            }
        }

    }
}
