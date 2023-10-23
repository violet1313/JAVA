package com.code.d_duixiang.P84_1;

import com.code.d_duixiang.P83_1.GirlFriend;

public class GirlFriendTest_this {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf1=new GirlFriend();
        //赋值
        gf1.setName("小红");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
    }
}
