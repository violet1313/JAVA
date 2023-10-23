package com.code.d_duixiang.P85;

public class Students {
    private String name;
    private int age;
    //如果我们自己没有写任何的构造方法
    //那么虚拟机会给我们加一个空参构造方法
    public Students(){       //类名，要跟上面的public class后面的完全一样
        System.out.println("看看我执行了吗？");
    }

    //带参构造--用于给成员变量初始化
    public Students(String name,int age){
        this.name=name;
        this.age=age;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
