package Practice;

public class Studenta {
    String name;    //String类型成员变量默认值是null
    int age;

    //setAge方法中有形参，调用setAge时需要传实参
    public void setAge(int a){

        System.out.println(age);
    }

    public int getAge(){
        return age;
    }
}
