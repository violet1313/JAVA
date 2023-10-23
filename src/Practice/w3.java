package Practice;
//老虎吃包子
//break; continue;
public class w3 {
    public static void main(String[] args){
        int i;
        for(i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println("老虎吃第"+i+"个包子");
        }

        System.out.println("\n");

        int j;
        for(j=1;j<=5;j++){
            if(j==3){
                break;
            }
            System.out.println("老虎吃第"+j+"个包子");
        }
    }
}
