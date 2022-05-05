package recursion;

import java.util.Scanner;
//阶乘 
public class Facture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			Scanner n = new Scanner(System.in);
			int fact = n.nextInt();
			if  (fact==-1)
				break;
			System.out.println(facture(fact));

		}
	}

	static int facture(int num){
		int sum=1;
		if (num < 0) {

			System.out.println("必须为正整数"); 
			return 0;
		}
		if (num == 0) {

			return 1 ;
		}
		else {
			sum = num * facture(num-1);
			return sum;
		}

	}

}

