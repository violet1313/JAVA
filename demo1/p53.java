package com.itheima.demo1;

import java.util.Random;

public class p53 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int number=r.nextInt(100)+1;
            System.out.println(number);
        }
    }
}
