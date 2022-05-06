import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
//递归调用
public class JieCh {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNum(n));
    }
    private  static int sumNum(int n){
        if (n == 1) {
            return 1;
        }
        return n*sumNum(n-1);
        }

    }

