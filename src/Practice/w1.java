package Practice;

import java.util.Scanner;

//键盘录入一个整数，判断是否是回文数
public class w1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int x=sc.nextInt();
        int temp=x;
        int ge;
        int num=0;
        //123
        while(x!=0){
            ge=x%10;
            x=x/10;
            num=num*10+ge;
        }
        System.out.println(num);
        System.out.println(x);
        System.out.println(num==temp);
    }
}