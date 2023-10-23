package com.code.d_duixiang.P84;

//就近原则和this关键字
public class GirlFriendd {
    //属性
    private int age;

    public void method1(){
        int age=10;
        System.out.println(age);         //就近原则
    }

    public void method2(){
        int age=20;
        System.out.println(this.age);  //this关键字
    }
}
