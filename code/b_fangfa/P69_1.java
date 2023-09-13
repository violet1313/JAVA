package com.code.b_fangfa;

/*需求：设计一个方法，用于数组遍历
 要求：遍历的结果是在一行上的。例如：{11,22,33,44,55}
 */
public class P69_1 {
    public static void main(String[] args) {
        int[]arr={11,22,33,44,55};
        bianli(arr);
    }

    public static void bianli(int arr[]){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
            System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("}");
    }
}
