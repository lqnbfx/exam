public class FenShu {
    public static void main(String[] args) {
        int[][] s = {{66, 53, 65, 60}, {70, 65, 80, 66}, {76, 67, 80, 72}, {85, 90, 78, 88}, {62, 76, 92, 83}};
//        System.out.println("学生平均分");
        int sum = 0;
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                sum += s[i][j];
            }
        }
        int aver = sum / 5;
        System.out.println("学生平均分:" + aver);

        for (int n = 0; n < 5; n++) {

            System.out.println("学生" + (n+1) + "总分" + sumstudent(s,n));
//            System.out.println("学生" + (n+1) + "总分" + sumevery);

            if (sumstudent(s,n) >= aver) {
                 count++;
            }

        }
        System.out.println("大于平均分学生总数"+count);
    }
    private  static int sumstudent(int[][] s ,int m){
            int sumevery = 0;
            for (int k = 0; k < s[m].length; k++) {
                sumevery += s[m][k];


                            }

        return sumevery;
        }

        }




