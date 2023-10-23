package Practice;

import java.util.Scanner;

public class lianxi8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num=sc.nextInt();
        switch(num){
            case 1-> System.out.println("一");
            case 2-> System.out.println("二");
            case 3-> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }
    }
}
