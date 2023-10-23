package Practice2;

public class Car {
    //此类中有一个默认的无参构造方法
    //构造方法名和类名相同
    //构造方法没有方法类型
    //构造方法是通过new关键字来调用的，用于创建对象
    public Car(){
        System.out.println("我是默认的无参构造");
    }
    private String name;
    private int age;

    //带参构造---用于给成员变量初始化
    public Car(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
