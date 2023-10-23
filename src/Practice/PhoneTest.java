package Practice;

public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p=new Phone();
        p.brand="小米";
        p.price=1999.9;
        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        //使用成员方法
        p.call();
        p.playGame();

        Phone p2=new Phone();
        p2.brand="苹果";
        p2.price=9999.9;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();
    }
}
