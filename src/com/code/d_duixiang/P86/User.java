package com.code.d_duixiang.P86;
//get和set方法
/*快捷键：alt+insert*/

public class User {
    //属性
    private String username;    //用户名
    private String password;    //密码
    private String email;       //邮箱
    private String gender;      //性别
    private int age;            //年龄

    //空参
    public User(){}
    //带全部参数的构造
    public User(String username,String password,String email,String gender,int age){
        this.username=username;
        this.password=password;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUsername(String username){
        this.username=username;
    }
    //get方法：对外提供username
    public String getUsername(){
        return username;
    }
}
