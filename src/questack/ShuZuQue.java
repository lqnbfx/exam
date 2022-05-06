package questack;

public class ShuZuQue {
       /**
     * 1.使用数组实现队列功能，使用int数组保存数据特点：先进先出，后进后出
     */
        public static void main(String[] args){

            //测试队列
            System.out.println("测试队列：");
            ShuZuQueue1 queue = new ShuZuQueue1();
            queue.in(1);
            queue.in(2);
            queue.in(3);
            System.out.println(queue.out());
            System.out.println(queue.out());
            queue.in(4);
            System.out.println(queue.out());
            System.out.println(queue.out());
            queue.in(5);
            System.out.println(queue.out());

        }
    }

    //使用数组定义一个队列
    class ShuZuQueue1 {

        int[] a = new int[5];
        int i = 1; //数组下标

        //入队
        public void in(int m){
            a[i++] = m;
        }

        //出队
        public int out(){
            int index = 0;
            int temp = a[1];
            for(int j=1;j<i;j++){
                a[j-1] = a[j];
                index++;
            }
            i = index;
            return temp;
        }
    }

