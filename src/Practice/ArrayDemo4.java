package Practice;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i]%3==0){
                temp++;
            }
        }
        System.out.println(temp);
    }
}
