package Practice;

import java.util.Random;

//打乱数据
public class ArrayDeom9 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随即索引
            int randonIndex=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randonIndex];
            arr[randonIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
