package Practice;

import java.util.Random;

/*需求：生成10个1~100之间的随机数存入数组。
      1.求所有数据的和
      2.求所有数据的平均数
      3.统计有多少个数据比平均值小
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        //随机生成数据
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成1-100之间的数字，并赋值给数组
            int num=r.nextInt(10)+1;
            arr[i]=num;
            //遍历数组
            System.out.print(arr[i]+" ");
        }
        //求所有数据的和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("和是"+sum);

        //求所有数据的平均数
        int average=sum/100;
        System.out.println("平均值是"+average);

        //统计有多少个数比平均值小
        int temp=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<average){
                temp++;
            }
        }
        System.out.println("有"+temp+"个数比平均值小");

    }
}
