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
        int[]arr=new int[10];
        //随机生成数据
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成1-100之间的数字，并赋值给数组
            int num=r.nextInt(100)+1;
            arr[i]=num;
            //遍历数组
            System.out.print(arr[i]+" ");
        }
        //求所有数据的和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("和是"+sum);

        //求所有数据的平均数
        int average=sum/100;
        System.out.println("平均值是"+average);

        //统计有多少个数比平均值小
        int temp=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<average){
                temp++;
            }
        }
        System.out.println("有"+temp+"个数比平均值小");

    }
}
