package array;


public class SuShuIn {
    public static void main(String[] args) {
        int j = 2;
        for (int i = 0; i < 100; i++) {
            //循环100次
            for (j = 2; j < i; j++) {
                //判断2到本身之间可以被整除吗
                if (i % j == 0) {
//                    System.out.println(i + "该数不为素数");
                    break;
                }
            }
//如果循环到它本身，说明2到本身之间没有可以被整除的数，则为素数
            if (i == j) {
                System.out.print(" "+i);
            }
        }
    }

}