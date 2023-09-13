package com.code.a_shuzu;

/*打乱数组中的数据
需求：定义一个数组，存入1~5. 要求打乱数组中的所有的数据
 */

 /*如何获取数组中的随机索引
        int[]arr={1,2,3,4,5};
        Random r=new Random();
        int randomIndex=r.nextInt(arr.length);
        System.out.println(randomIndex);
         */

import java.util.Random;

public class p61 {
    public static void main(String[] args) {
        //1.定义数组存储1~5
        int[]arr={1,2,3,4,5};
        //2，循环遍历数组，从0索引开始打乱数据的顺序
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex=r.nextInt(arr.length);
            //交换
            int t=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=t;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
