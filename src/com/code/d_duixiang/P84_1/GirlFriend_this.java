package com.code.d_duixiang.P84_1;

//P83改  ---this关键字
//this不会到局部位置上，而是直接使用成员变量
public class GirlFriend_this {
        private String name;
        private int age;
        private String gender;

        //针对每一个私有化的成员变量，都要提供get和set方法
        //set方法：给成员变量赋值
        //get方法：对外提供成员变量的值

        //作用：给成员变量name进行赋值
        public void setName(String name){
            this.name=name;
        }
        //作用：对外提供name属性
        public String getName(){
            return name;
        }

        //age
        //setage：给成员变量赋值
        //getage：对外提供成员变量age的值
        public void setAge(int age){
            if(age>=18 && age<=50){
                this.age=age;
            }else{
                System.out.println("非法参数");
            }
        }
        public int getAge(){
            return age;
        }

        public void setGender(String gender){
            this.gender=gender;
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
