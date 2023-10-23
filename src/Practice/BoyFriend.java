package Practice;

public class BoyFriend{
    //属性：身高 体重 年龄
    double stature;
    double weight;
    int age;
    //行为：设置年龄，学习，敲键盘
    public void study(){
        System.out.println("在学习");
    }
    public void qiaonianpan(){
        System.out.println("在敲键盘");
    }
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
}