package Practice2;

public class Fuck {
    private String name;
    private int age;

    //set方法用于设置私有化成员变量的值
    //get方法用于获取私有化成员变量的值

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
}
