package Practice2;

public class Student {
    private int age;     //被private修饰的成员变量叫私有变量
                         //私有变量只能在本类中访问，不允许其他类（外部）访问
    public int setAge(int a){
        age=a;
       return age;
    }

}
