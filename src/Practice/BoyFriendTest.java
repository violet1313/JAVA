package Practice;

public class BoyFriendTest {
    public static void main(String[] args) {
        BoyFriend b=new BoyFriend();
        b.stature=185;
        b.weight=120;
        b.age=18;
        System.out.println(b.stature);
        System.out.println(b.weight);
        System.out.println(b.age);
        System.out.println(b.getAge());
        b.study();
        b.qiaonianpan();
    }
}
