package com.code.d_duixiang.P82;

import com.code.d_duixiang.P82.GirlFrind;

public class GirlFrind_text {
    public static void main(String[] args) {
        GirlFrind gf1=new GirlFrind();
        gf1.name="小红";
        gf1.age=18;
        gf1.gender="妹子";
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        System.out.println("==================================");
        GirlFrind gf2=new GirlFrind();
        gf2.name="小蛋蛋";
        gf2.age=19;
        gf2.gender="萌妹子";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.eat();
        gf2.sleep();
    }
}
