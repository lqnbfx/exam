package search;

public class ErFenChaZhao {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7,9,10,13,15,22,26,38};
        int result = binarySearch(arr, 8);
        if (result == -1) {
            System.out.println("can not find");
        }
            else {
            System.out.println("the number location is  "+(result+1));
        }
    }

    public static int binarySearch(int[] srcArray, int des) {
        //定义初始最小、最大索引
        int start = 0;
        int end = srcArray.length - 1;
        //确保不会出现重复查找，越界
        while (start <= end) {
            //计算出中间索引值
//            int middle = (end + start)>>>1 ;//防止溢出
            int middle = end + start;
            if (des == srcArray[middle]) {
                return middle;
                //判断下限
            } else if (des < srcArray[middle]) {
                end = middle - 1;
                //判断上限
            } else {
                start = middle + 1;
            }
        }
        //若没有，则返回-1
        return -1;
    }
}
