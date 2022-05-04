package exam;
//5个学生，4门课程  ，计算每个学生总成绩和 平均分 （平局分=5个学生总成绩和/学生人数），统计总成绩超过平均分（含平均）的人数，输入学生各科成绩为
/*一 66,53,65,60
 二 70,65,80,66
 三 76,67,80,72
 四 85,90,78,88
 五 62,76,92,83
 */

public class ChengJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] student1 = new int[] {66,53,65,60};
		 int[] student2 = new int[] {70,65,80,66};
		 int[] student3 = new int[] {76,67,80,72};
		 int[] student4 = new int[] {85,90,78,88};
		 int[] student5 = new int[] {62,76,92,83};
		 int[] sumall=new int[5];
		 int sumzong =0;
		 int count=0;
		 int avg=0;
		 System.out.println("打印出学生1到5的总成绩");
		
		  sumall[0] = sumall(student1);
		  sumall[1] = sumall(student2);
		  sumall[2] = sumall(student3);
		  sumall[3] = sumall(student4);
		  sumall[4] = sumall(student5);
		  for (int j=0;j<5;j++) {
			  sumzong += sumall[j];
			  System.out.println("学生"+(j+1)+"总成绩:"+sumall[j]);	 
		  }
	
		 System.out.println("打印出学生平均分");
		 avg=sumzong/5;
		 System.out.println("学生平均分"+avg);
		 
		 
		 System.out.println("统计总成绩超过平均分的人数");
		 for (int j=0;j<5;j++) {

			  if (sumall[j]>=avg) {
				  count++;	
			  }
		 }
		 System.out.println("统计总成绩超过平均分的人数:"+count);
		 
	}
	
	public static int sumall(int[] student) {
		int sum = 0;
		for (int i=0;i<4;i++) {
			sum += student[i]; 
		 }
		return sum;
	}
		
	}


