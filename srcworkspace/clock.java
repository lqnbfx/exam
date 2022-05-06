package exam;
//打印0点0分-23点59分
public class clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<24;i++) {
			for(int j=1;j<60;j++) 
				System.out.println(i+"点"+j+"分");
		}	
	}
}
