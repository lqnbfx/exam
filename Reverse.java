package exam;
import java.util.Scanner;

//输入一个字符串进行翻转
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  str= new Scanner(System.in) ;
		System.out.println("请输入字符串：");
		String strs = str.nextLine();
		
		StringBuilder strb = new StringBuilder(strs); 
//		String strrever = strb.reverse().toString();
//		System.out.println(strrever);
		
		System.out.println(strb.reverse().toString());
		
	}



}
