package com.code.b_fangfa;

//需求：使用方法重载的思想，设计比较两个整数是否相同
//要求：兼容全整数类型(byte,short,int,long)

public class P68 {
    public static void main(String[] args) {
        //conpare((byte)10,(byte)20);
        byte b1=10;
        byte b2=20;
        compare(b1,b2);
    }


    public static void compare(byte b1,byte b2){
        System.out.println("byte");
        System.out.println(b1==b2);
    }
    public static void compare(short s1,short s2){
        System.out.println("short");
        System.out.println(s1==s2);
    }
    public static void compare(int l1,int l2){
        System.out.println("int");
        System.out.println(l1==l2);
    }
    public static void compare(long lon1,long lon2){
        System.out.println("long");
        System.out.println(lon1==lon2);
    }
}

