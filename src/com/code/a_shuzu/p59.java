package com.code.a_shuzu;

/*需求：生成10个1~100之间的随机数存入数组。
      1.求所有数据的和
      2.求所有数据的平均数
      3.统计有多少个数据比平均值小
 */

import java.util.Random;

public class p59 {
    public static void main(String[] args) {
        //1.定义数组（动态）
        int[]arr=new int[10];
        Random r=new Random();
        //2.把随机数存到数组中---每循环一次,生成一个新的随机数
        for (int i = 0; i < arr.length; i++) {
            int number=r.nextInt(100)+1;
            arr[i]=number;
        }

        //1.求所有数据的和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数组中所有数据的和为："+sum);

        //2.求所有数据的平均数
        int avg=sum/arr.length;
        System.out.println("数组中的平均数为:"+avg);

        //3.统计有多少个数据比平均值小
        int count=0;    //统计变量
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                count++;
            }
        }
        System.out.println("数组中有"+count+"个数据比平均数小");

        //遍历数组，验证答案
        System.out.print("数组中的数据为");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
