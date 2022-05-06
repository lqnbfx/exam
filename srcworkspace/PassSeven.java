//逢七过
//打印1-100中包含7,7的倍數，
public class PassSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%10==7 || i/10==7 || i%7==0) 
				System.out.println(i);
			}
	}

}
