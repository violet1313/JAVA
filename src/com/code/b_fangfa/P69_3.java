package com.code.b_fangfa;

import java.util.Scanner;

//定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
public class P69_3 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        boolean flag=contain(arr);
        System.out.println(flag);
    }

    public static boolean contain(int[]arr){
        System.out.print("请输入要查找的数字：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {

           /* if(arr[i]==num){
                System.out.println(arr[i]);
                break;
            }else{
                System.out.println("不存在");
                break;
            }*/

            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
