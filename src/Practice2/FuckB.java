package Practice2;

public class FuckB {
    private String name;
    private String author;
    private int age;

    public FuckB(String name,String author,int age){
        this.name=name;
        this.author=author;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
