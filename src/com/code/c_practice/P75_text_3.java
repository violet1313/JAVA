package com.code.c_practice;

/*需求：定义方法实现随机产生一个5位的验证码
  验证码格式：长度：5
            前四位：大写字母或小写字母
            最后一位：数字
 */

import java.util.Random;

public class P75_text_3 {
    public static void main(String[] args) {
        /*方法：在以后如果我们要在一堆没有什么规律的数据中抽取
                可以先把这些数据存入数组中
                再随机抽取一个索引
         */

        //1.大小写字母都放到数组中
        char[]chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码
            if(i<=25){
                //添加小写字母
                chs[i]=(char)(97+i);
            }else{
                //i---27
                //添加大写字母
                chs[i]=(char)(65+i-26);   //循环下来65+了26，应当再-26 恢复原样
            }
        }

        //#####定义一个字符串类型的变量，用来记录最终的结果#####
        String result="";

        //2.随机抽取4次（随机抽取数组中的索引）
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex=r.nextInt(chs.length);
          System.out.print(chs[randomIndex]);
           // result=result+chs[randomIndex];
        } // System.out.println(result);

        //3.随机抽取一个数字
        int number=r.nextInt(10);

        //生成最终结果
        result=result+number;
        System.out.println(result);



        /*遍历
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]+" ");
        }*/





    }
}
