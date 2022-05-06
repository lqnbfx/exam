// 输出100-1000的水仙花数 -每一位立方之和等于原数
public class TestFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0 ;
		for(int i=100;i<1000;i++) {
			int ge=i%10 ;
		    int shi=i/10%10 ;
		    int bai=i/10/10 ;
		   
	
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i) {
				System.out.println(i);
				counter++;
			}
			
		}	
		System.out.println("水仙花总数:"+counter);
	}

}
