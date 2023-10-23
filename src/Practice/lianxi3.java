package Practice;
//导包：指明Scanner类在哪里
import java.util.Scanner;

public class lianxi3 {
    public static void main(String[] args) {
      /* System.out.println("请输入两个数字");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(num1+num2);*/
        System.out.println("请输入一个数字");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean result=(a==6 || b==6 || (a+b)%6==0);
        System.out.println(result);
        }
}
