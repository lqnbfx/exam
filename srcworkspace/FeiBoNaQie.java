package exam;
//不死神兔
//打印前20个斐波那契数列
public class FeiBoNaQie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");		
		}
		System.out.println("");
		System.out.println("数组总数："+arr.length);
	}

}
