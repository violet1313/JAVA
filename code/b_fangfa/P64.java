package com.code.b_fangfa;

//方法简单的定义和调用格式
public class P64 {
    public static void main(String[] args) {
        //调用方法
        playGame();
        playGame();
    }
/* 注意：方法的定义要写在main方法的外面，类的里面*/
    public static void playGame(){
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }
}
