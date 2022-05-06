package array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,4,67,23,78,99,12,56};
    //    求最大值
        maxnumber(arr);
    //    求最小值
        minnumber(arr);
    //    求总和
        sumnumber(arr);
    }

    //    求最大值
   public static void maxnumber(int[] arr){

       int max=arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       System.out.println("the max number is "+max);
   }

    //    求最小值
    public static void minnumber(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the min number is "+min);
    }

    //    求总和 及平局数
    public static void sumnumber(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
               }
        System.out.println("the sum number is "+sum);
        System.out.println("the avg number is "+sum/arr.length);
        }


}
