
//百钱白鸡
//鸡翁5钱1只，鸡母3钱1只，鸡雏1钱3只，百钱买百鸡，怎么分买鸡

/*
 鸡翁5x钱 + 鸡母3y钱  +  小鸡 z/3钱=100钱
 x+y+z=100鸡
 0<=x<=20
 0<=y<=33
 0<=z<=100
 */
public class BaiQianBaiJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int x=0 ; x<21 ; x++) {
//			for(int y=0;y<34;y++) {
//				for(int z=0;z<100;z++) {
//					if(5*x+3*y+z/3==100 && x+y+z==100 && z%3==0) {
//						System.out.println("鸡翁: "+x+" 母鸡："+y+" 小鸡："+z);
//						
//					}
//						
//				}
//				
//			
//		}
//	}
		for(int x=0 ; x<21 ; x++) {
			for(int y=0;y<34;y++) {
				int z=100-x-y;
				if(5*x+3*y+z/3==100 && z%3==0 )
					System.out.println("鸡翁: "+x+" 母鸡："+y+" 小鸡："+z);
			}
		}
}
}
