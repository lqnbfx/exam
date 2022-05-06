package sort;

import java.util.Arrays;

public class QuikSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {3,4,9,2,5,7,0,1,2,3,6,8};
        QuikSortTest(arr, 0, arr.length-1);
//        String str = Arrays.toString(arr);
//       System.out.println(str);
        for(int x: arr)
        	System.out.print(x+" ");
	}	


static void  QuikSortTest(int[] arr,int left,int right){
	if(left > right)
		return;

	int base = arr[left];
	int i = left;
	int j = right;
	while(i != j) {
		while(arr[j] >= base && j>i)
			j--;
		while(arr[i] <= base && j>i)
			i++;
		if(j > i) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}
	
	arr[left] = arr[i];
	arr[i]=base;
	QuikSortTest(arr, left, i-1);
	QuikSortTest(arr, i+1, right);
	
}
}