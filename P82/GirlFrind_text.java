package P82;

public class GirlFrind_text {
    public static void main(String[] args) {
        GirlFrind gf1=new GirlFrind();
        gf1.name="小红";
        gf1.age=18;
        gf1.gender="妹子";
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        System.out.println("==================================");

    }
}
