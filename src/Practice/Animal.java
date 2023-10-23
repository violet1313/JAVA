package Practice;

//属性：种类 性别 食性
//行为：觅食 睡觉 迁徙
public class Animal {
    String kind;    //种类
    String gender;   //性别
    String shixing; //食性

    public void eat(){
        System.out.println("在觅食");
    }
    public void sleep(){
        System.out.println("在睡觉");
    }
    public void qianxi(){
        System.out.println("在迁徙");
    }
}
