package com.code.b_fangfa;

public class P73_1 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }

    public static void change(int[]arr){
        arr[1]=100;
    }
}
