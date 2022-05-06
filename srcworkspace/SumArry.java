//数组求和，元素个位，十位不能是7，并且只能是偶数
public class SumArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {68,27,95,88,171,996,51,210};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			if ((arr[i]%10!=7 && arr[i]/10%10!=7) && arr[i]%2==0 )
				sum+=arr[i];
		System.out.println("sum为"+sum);
	}
	
}
