
import java.util.Scanner;
//减肥计划if版本
/*
 输入星期数，显示今天的减肥活动
 周一：跑步
 周二：游泳
 周三：慢走
周四：动感单车
周五： 拳击
周六：爬山
周日：好好吃一顿
 */
public class JianFeiIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期数：");
		int week = sc.nextInt();
		if (week < 1 || week > 7) {
			System.out.println("输入错误，请输入正确的星期数");
		} else if (week == 1) {
			System.out.println("跑步");
		} else if (week == 2) {
			System.out.println("游泳");
		} else if (week == 3) {
			System.out.println("慢走");
		} else if (week == 4) {
			System.out.println("动感单车");
		} else if (week == 5) {
			System.out.println("拳击");
		} else if (week == 6) {
			System.out.println("爬山");
		} else {
			System.out.println("好好吃一顿");
		}

	}

}
