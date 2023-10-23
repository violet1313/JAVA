package Practice;

import java.util.Scanner;

/*练习1：逢7过
朋友聚会的时候可能会玩一个游戏:逢7过
游戏规则:从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过:过
需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
*/
public class w4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int x=sc.nextInt();
        int temp=0;       //计数器
        for(int i=x;i<=100;i++) {
            //个位是7；十位是7；7的倍数
            if (x > 0 && x <= 100) {
                if (i % 7 == 7 || i / 10 % 7 == 7 || i % 7 == 0) {
                    System.out.print(i + "\t");
                    temp++;
                }
            }
             else System.out.println("输入数字不符合范围！");
             break;
        }
        System.out.println("有"+temp+"个");
    }
}
