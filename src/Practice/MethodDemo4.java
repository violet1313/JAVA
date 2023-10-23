package Practice;

public class MethodDemo4 {
    public static void main(String[] args) {
        int sum1=getsum(1,2,3);
        int sum2=getsum(1,2,3);
        int sum3=getsum(1,2,3);
        int sum4=getsum(1,2,3);
        int sum=sum1+sum2+sum3+sum4;
        System.out.println(sum);
    }
    public static int getsum(int num1,int num2,int num3){
        int result=num1+num2+num3;
        return result;
    }
}
