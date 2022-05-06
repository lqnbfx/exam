package questack;

import java.util.ArrayList;
import java.util.List;

public class ArrayQue {
    public static void main(String[] args) {

        //测试队列
        System.out.println("测试队列：");
        ArrayQueue1 queue = new ArrayQueue1();
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
//        队列为空返回-1
//        System.out.println(queue.out());


    }
}

    class ArrayQueue1 {

        List<Integer> list = new ArrayList<Integer>();
        int index = 0;  //下标

        //入队
        public void in(int n){
            list.add(n);
            index++;
        }

        //出队
        public int out(){
            if(!list.isEmpty()){
                index--;
                return list.remove(0);
            }
            return -1;
        }

    }


