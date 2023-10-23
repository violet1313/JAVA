package com.code.b_fangfa;

import java.util.Scanner;

//需求：定义一个方法，求长方形的周长 ，将结果在方法中打印
public class P65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入长方形的长：");
        double a=sc.nextDouble();
        System.out.print("请输入长方形的宽:");
        double b=sc.nextDouble();
        System.out.print("长方形的周长为：");
        changfangxingsum(a,b);
    }
    public static void changfangxingsum(double a,double b){
        double result=(a+b)*2;
        System.out.println(result);
    }
}
