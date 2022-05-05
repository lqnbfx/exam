package search;

import java.util.Scanner;

public class ShunXuChaZhao {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 1, 9, 0, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int number = sc.nextInt();
        int out = find(arr,number);
        if(out==-1){
            System.out.println("can not find number");
        }
        else
            System.out.println("find number "+number+" location: "+(out+1));

    }

     public static int find(int[] a, int num) {
         for(int i=0;i<a.length;i++){
             if(num==a[i])
                 return i;
         }
         return -1;
        }
    }

