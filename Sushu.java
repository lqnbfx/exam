import java.util.Scanner;

public class Sushu {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        int i = 0;
        for(i=1;i<=value;i++)
        {
            for(int j=1;j<i;j++)
            {
                if((i%j==0)&&j!=1){
                    break;
                }else{
                    if(i==(j+1)){
                        System.out.println(i);
                    }
                }
            }
        }

    }
}




