package array;

public class WanQuan {
//    查找100-1000的完全平方数
           public static void main(String[] args)
        {
            showNumber(100, 1000);
        }


        public static void showNumber(int a, int b)
            {
                for (; a <= b; a++)
                {
                    for (int i = 0; i <= a; i++)
                    {
                        if (i*i == a)
                            System.out.println(a);
                    }
                }
            }
        }






