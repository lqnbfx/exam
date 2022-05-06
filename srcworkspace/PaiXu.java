//冒泡一维数组排序 a=【3,11,14,1,6,7,9,5】由小到大
public class PaiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {3,11,14,1,6,7,9,5};
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-i-1;j++) {
				if (num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1]=tmp;
							
				}
			}
		}
		System.out.print("冒泡排序："+"[");
		for(int k=0;k<num.length;k++)
		System.out.print(" "+num[k]);
		System.out.println("]");
	}

}
