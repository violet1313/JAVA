package com.itheima.demo1;

public class P58 {
    public static void main(String[] args) {
        int[]arr={22,11,33};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
