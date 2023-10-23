package Practice;

import java.util.Random;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[]arr={};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);
            //交换
            int t=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
