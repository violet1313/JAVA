package Practice;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.kind="狗";
        a.gender="男";
        a.shixing="草";
        System.out.println(a.kind);
        System.out.println(a.gender);
        System.out.println(a.shixing);
        a.eat();
        a.sleep();
        a.qianxi();
    }
}
