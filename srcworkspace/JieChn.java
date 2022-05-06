
import java.util.Scanner;

public class JieChn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int n = num.nextInt();
		
		int sum = 1;
		for (int i=1;i<n;i++) {			
			sum *= i+1;
		}
		System.out.println("阶乘数"+sum);

		
	}

}
