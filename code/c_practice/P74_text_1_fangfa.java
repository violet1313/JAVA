package com.code.c_practice;

import java.util.Scanner;

public class P74_text_1_fangfa {
    public static void main(String[] args) {
        //1.键盘录入各项数据
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        int ticket = sc.nextInt();
        System.out.print("请输入当前的月份：");
        int month = sc.nextInt();
        System.out.print("请输入当前购买的舱位：");
        System.out.print("0--头等舱   1--经济舱");
        int seat = sc.nextInt();
        //2.判断淡旺季
        if (month >= 5 && month <= 10) {
            ticket = getprice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 1 && month <= 12)) {
            ticket = getprice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("键盘录入的月份不合法！");
        }
        System.out.println("该票的票价为" + ticket);
    }
    /*1.我要干嘛？
        -根据舱位和这折扣来计算票价
      2.我干这件事，需要什么才能完成？
        -原价、舱位、月份、折扣
      3.方法的调用处是否需要继续使用这种结果？
        -需要
     */
    public static int getprice(int ticket, int seat, double document1, double document2) {
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * 0.7);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * 0.65);
        } else {
            System.out.println("没有这个座位!");
        }
        return ticket;
    }
}
