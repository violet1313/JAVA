package Practice2;

public class FuckA {
   private String name;
   private String sex;
   private int age;

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getSex(){
       return sex;
   }
   public void setSex(String sex){
       this.sex=sex;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }
   public void show(){
       System.out.println("我是"+name+","+sex+","+age+"岁");
   }
}
