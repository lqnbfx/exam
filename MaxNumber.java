public class MaxNumber {
//求任意数组中所有元素的最大值
public static void main(String[] args) {


    int[] arr={90,32,22,456,1562,998,666,999,10000,3000,999999};
    int max = arr[0];
    for(int i=0;i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }

    }
    System.out.println("max number is "+max);
}

}
