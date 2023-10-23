package com.code.b_fangfa;

//要求：在方法里面定义两个变量，并求和打印

import java.util.Scanner;

public class P64_3 {
    public static void main(String[] args) {
        getsum(10,20);
        System.out.println("请输入两个值");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("它们的和为");
        getsum(a,b);
    }
    public static void getsum(int num1,int num2){
        int result=num1+num2;
        System.out.println(result);
    }
}
