package Practice;

import java.util.Scanner;

public class lianxi5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入3个数字：");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int max=num1>num2?num1:num2;
        max=max>num3?max:num3;
        System.out.println(max);
    }
}
