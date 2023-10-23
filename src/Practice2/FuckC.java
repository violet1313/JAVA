package Practice2;

public class FuckC {
        private String name;
        private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //构造方法
        public FuckC() {
            System.out.println("无参构造方法");
        }

        public void show() {
            System.out.println(name + "," + age);
        }
}


