package Practice;

import java.util.Scanner;

public class MethodDemo1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入两个整数:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print(num1+"+"+num2+"=");
        getsum(num1,num2);
    }
    public static int getsum(int num1,int num2){
        System.out.println(num1+num2);
        return num1+num2;
    }
}