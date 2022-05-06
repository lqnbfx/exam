import java.util.Scanner;

/* 输入三个数通过三目运算符取最大值 */
public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	 	System.out.println("请输入第一个和尚体重");
		int hight1 = sc.nextInt();
		System.out.println("请输入第二个和尚体重");
		int hight2 = sc.nextInt();
		System.out.println("请输入第三个和尚体重");
		int hight3 = sc.nextInt();
	/*相同的数用三目比大小怎么算的？？？*/	
		int temphight = hight1>hight2?hight1:hight2;
		int maxhight= temphight>hight3?temphight:hight3;
		System.out.println("最高的和尚是"+maxhight);
	}

}
