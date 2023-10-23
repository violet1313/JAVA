package com.code.c_practice;

import java.util.Scanner;

/*需求：机票价格按照淡季旺季、头等舱经济舱收费
       输入机票原价、月份、舱的类型
机票定价规则：旺季（5-10月）：头等舱9折，经济舱8.5折
            淡季（11-来年4月):头等舱7折，经济舱6.5折
 */
public class P74_text_1 {
    public static void main(String[] args) {
        //1.键盘录入各项数据
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        int ticket=sc.nextInt();
        System.out.print("请输入当前的月份：");
        int month= sc.nextInt();
        System.out.print("请输入当前购买的舱位：");
        System.out.print("0--头等舱   1--经济舱");
        int seat=sc.nextInt();
        //2.判断淡旺季
        if(month>=5 && month<=10){
            //旺季
            if(seat==0){
                //头等舱
                ticket=(int) (ticket*0.9);
            }else if(seat==1){
                //经济舱
                ticket=(int) (ticket*0.85);
            }else{
                System.out.println("没有这个座位!");
            }
        }


        else if((month>=1 && month<=4) || (month>=1 &&month<=12)){
            //淡季
            if(seat==0){
                //头等舱
                ticket=(int) (ticket*0.7);
            }else if(seat==1){
                //经济舱
                ticket=(int) (ticket*0.65);
            }else{
                System.out.println("没有这个座位!");
            }
        }else{
            System.out.println("键盘录入的月份不合法！");
        }
        System.out.println("该票的票价为"+ticket);
    }
}
