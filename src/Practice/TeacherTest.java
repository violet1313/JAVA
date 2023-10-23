package Practice;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="哈哈";
        t.age=19;
        System.out.println(t.name);
        System.out.println(t.age);
        t.setAge();
    }
}
