public class ShuiXianHua {
//    打印水仙花数是指一个三位数，其各位数字立方和等于该数字本身
    public static void main(String[] args) {
        System.out.println("水仙花数是");
        for (int i = 100; i < 1000; i++) {
            if (isAim(i)) {
                System.out.println(i);
            }
        }
    }
       public static boolean isAim (int num){
            int x = num/100;
            int y = num/10%10;
            int z = num%10;
            if (num == x*x*x + y*y*y +z*z*z) {
                return true;
            }
             return false;
        }
    }

