package sort;

import java.util.Arrays;

public class ZhiJieWhile {
    public static void main(String[] args) {
        int[] number = {13, 15, 24, 99, 4, 1};
        insertionSort(number);
      }
    public static void insertionSort(int[] array){
        int insertValue;//无序子数组的头元素，待插入的元素
        int insertIndex;//有序子数组的尾元素
        for (int i = 1; i <array.length ; i++) {//开始时，有序子数组只有一个元素，即数组的头元素
            insertValue = array[i];//要插入的值保存在insertValue中
            insertIndex = i-1;//有序子数组的首元素的下标
            //当要插入的值小于有序子数组当前位置的值，说明要插入的位置还要向前移动
            //当然最极端的位置就是数组的头元素的位置，否则数组越界
            while (insertIndex>=0&&insertValue<array[insertIndex]){
                array[insertIndex+1] = array[insertIndex];//将大于待插入值的元素向后移动
                insertIndex--;//继续向前找要插入的位置
            }
            //位置找到后插入到这个位置
            array[insertIndex+1]=insertValue;
            System.out.println("第"+i+"次插入数组序列："+ Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}




