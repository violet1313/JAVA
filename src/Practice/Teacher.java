package Practice;

public class Teacher {
    //成员变量
    String name;
    int age;

    public void setName(){
        //输出name----就近原则
        String name="你好";   //局部变量(局部变量没有初始值就会报错
        System.out.println(name);
    }
 
    public void setAge(){
        //输出age
        System.out.println(age);
        age=age;
    }



}
