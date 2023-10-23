package com.code.d_duixiang.P83;
//***封装***//
public class Friend {
        private String name;
        private int age;
        private String gender;
        //set方法：给成员变量赋值
        //get方法:对外提供成员变量的值
        //作用：给成员变量name进行赋值
        public void setName(String n){
            name=n;
        }
        //作用：对外提供name属性
        public String getName(){
            return name;
        }

        //age
        //setAge
        //getAge

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

}
