package com.code.b_fangfa;

//目标：能区分出什么时候使用带返回值的方法
//需求：定义方法，比较两个长方形的面积
public class P66_2 {
    public static void main(String[] args) {
        //调用方法，获取长方形的面积
        double area1=getArea(1.3,1.2);
        double area2=getArea(1.5,1.1);

        if(area1>area2){
            System.out.println("第一个大");
        }else {
            System.out.println("第二个大");
        }
    }
   /* public static void compare(double len1,double width1,double len2,double width2){
        double area1=len1*width1;
        double area2=len2*width2;

        if(area1>area2){
            System.out.println("第一个更大");
        }else{
            System.out.println("第二个更大");
        }
    }*/


    //1.我要干嘛？---求长方形面积
    //2.需要什么？---长 宽
    //3.方法的调用处，是否需要继续使用方法的结果
    //              如果要用，方法必须有返回值
    //              如果不用，方法可以不写返回值
    public static double getArea(double len,double width){
        double area=len*width;
        return area;
    }

}
