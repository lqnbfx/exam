package sort;

import java.util.Arrays;

public class XuanZe {
    public static void main(String[] args) {
       int[] arr = {12,45,78,98,12,33,65,45,7};
       selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 交换次数
            // 先假设每次循环时，最小数的索引为i
            int minIndex = i;
            // 每一个元素都和剩下的未排序的元素比较
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {//寻找最小数
                    minIndex = j;//将最小数的索引保存
                }
            }//经过一轮循环，就可以找出第一个最小值的索引，然后把最小值放到i的位置
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}