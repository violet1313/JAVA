package Practice;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[]arr={33,5,22,44,55};
        int x=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(x<arr[i]){
                //交换数值
                x=arr[i];
            }
        }
        System.out.println(x);
    }
}
