package questack;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack {

    /**
     * 2.使用集合实现堆栈功能，使用int数组保存数据特点：先进后出，后进先出
     */

          public static void main(String[] args){

            //测试堆栈
            System.out.println("2.集合实现一个堆栈：");
            ArrayStack1 stack = new ArrayStack1();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            stack.push(5);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }
    }

    //使用集合定义一个堆栈
    class ArrayStack1 {

        List<Integer> list = new ArrayList<Integer>();
        int index = 0; //下标

        //入栈
        public void push(int n){
            list.add(n);
            index++;
        }

        //出栈
        public int pop(){
            if(!list.isEmpty()){
                index--;
                return list.remove(index);
            }
            return -1;
        }
    }



