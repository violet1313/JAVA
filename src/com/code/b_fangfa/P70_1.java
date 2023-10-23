package com.code.b_fangfa;
/*需求：定义一个方法copyOfRange(int[]arr,int from,int to)
功能：将数组arr中从索引from(包含from)开始,
     到索引to(不包含to)的元素复制到新的数组中，
     将新数组返回
 */
public class P70_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9, 10};
        int[]copyArr=copyOfRange(arr,3,7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }
    public static int[] copyOfRange(int[]arr, int from, int to) {
        int[] newArr = new int[to-from];
        int j = 0;
        for (int i = from; i < to; i++) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
}

