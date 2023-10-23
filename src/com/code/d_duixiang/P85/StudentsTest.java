package com.code.d_duixiang.P85;
//构造方法

public class StudentsTest {
    public static void main(String[] args) {
        /*
        //创建对象
        //调用空参构造
        Students s=new Students();*/

        //有参构造
        Students s=new Students("zhangsan",23);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
