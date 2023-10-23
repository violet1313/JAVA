package Practice;

import java.util.Random;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int num=r.nextInt(100)+1;
            arr[i]=num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
