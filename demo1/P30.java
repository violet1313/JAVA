package com.itheima.demo1;

import java.util.Scanner;

public class P30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number=sc.nextInt();
        int ge=number%10;
        int shi=number/10%10;
        int bai=number/100%10;
        System.out.println("个位为：");
        System.out.println(ge);
        System.out.println("十位为：");
        System.out.println(shi);
        System.out.println("百位为：");
        System.out.println(bai);
    }
}
