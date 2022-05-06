package exam;
import java.util.Random;
import java.util.Scanner;

//产生一个随机的1-100的数，进行猜测。random随机生成一个【0,1）数值
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random guess = new Random();
		int guessNumber = guess.nextInt(100) + 1;
		while (true) {
			System.out.println("请输入猜测的数字：");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			if (number > guessNumber) {
				System.out.println("你输入数字过大");
			} else if (number < guessNumber) {
				System.out.println("你输入数字过小");
			} else {
				System.out.println("恭喜你猜对了");
				break;
			}
		}
	}
}
