package array;

import java.util.Scanner;

public class SuShu {
    public static boolean isPrime(int m) {
        if(m==1){
            return false;
        }
        for (int i = 2; i < m; i++) {
//判断2到m之间的素数
            if (m % i == 0 ) {
                //如果可以被其他数整除说明该数不为素数
                //返回false
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入一个数对这个数进行判断
        int m = scanner.nextInt();
        //在这里进行调用函数
        if (isPrime(m)) {
            System.out.println("该数是素数");
        } else {
            System.out.println("该数不是素数");
        }
    }
}

