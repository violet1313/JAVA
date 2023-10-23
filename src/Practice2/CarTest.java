package Practice2;

public class CarTest {
    public static void main(String[] args){
        Car c1=new Car();
        Car c3=new Car();
        Car c2=new Car("wuling",10);
        System.out.println(c2.getName()+" "+c2.getAge());
    }
}
