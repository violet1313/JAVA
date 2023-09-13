package com.code.b_fangfa;
/*需求：设计一个方法，求数组的最大值，并将最大值返回*/
public class P69_2 {
    public static void main(String[] args) {
        int[]arr={11,22,33,44,55,332,1,75,22};
        int max=max(arr);
    }
    public static int max(int arr[]){
        int t=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>t){
                t=arr[i];
            }
        }
        System.out.println(t);
        return t;
    }
}
