package com.code.b_fangfa;


//目标：掌握返回值方法的定义和调用格式
public class P66 {
    public static void main(String[] args) {
        //直接调用
        getsum(10,20,30);

        //赋值调用
        int sum=getsum(10,20,30);
        System.out.println(sum);

        //输出调用
        System.out.println(getsum(10,20,30));
    }
    public static int getsum(int num1,int num2,int num3){
        int result=num1+num2+num3;
        return result;
    }
}
