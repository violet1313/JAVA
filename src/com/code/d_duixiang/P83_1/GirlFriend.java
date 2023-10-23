package com.code.d_duixiang.P83_1;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    //针对每一个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量name进行赋值
    public void setName(String n){
        name=n;
    }
    //作用：对外提供name属性
    public String getName(){
        return name;
    }

    //age
    //setage：给成员变量赋值
    //getage：对外提供成员变量age的值
    public void setAge(int a){
        if(a>=18 && a<=50){
            age=a;
        }else{
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String g){
        gender=g;
    }
    public String getGender(){
        return gender;
    }

    //行为
    public void eat() {
        System.out.println("正在吃饭");
    }
    public void sleep(){
        System.out.println("正在睡觉");
    }
}
