package com.code.c_practice;

// 需求：把一个数组中的元素复制到另一个数组中

public class P75_text_4 {
    public static void main(String[] args) {
        //1.定义一个老数组存储一些元素
        int[]arr={1,2,3,4,5};

        //2.定义一个新数组，长度和老数组一致
        int[]newarr=new int[arr.length];

        //3.遍历老数组，得到老数组中的每一个元素，依次存入到新数组中去
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr[i]);
            newarr[i]=arr[i];
        }

        //打印新数组
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
