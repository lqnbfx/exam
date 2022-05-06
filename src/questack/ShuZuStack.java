package questack;

public class ShuZuStack {

    /**
     * 1.使用数组实现堆栈功能，使用int数组保存数据特点：先进后出，后进先出
     */

     public static void main(String[] args){

            //测试堆栈
            System.out.println("1.数组实现一个堆栈：");
            Stack stack = new Stack();
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

    //使用数组定义一个堆栈
    class Stack {

        int[] a = new int[5];
        int i = 0; //数组下标

        //入栈
        public void push(int n){
            a[++i] = n;
        }

        //出栈
        public int pop(){
            if(i>0){
                return a[i--];
            }
            return -1;
        }

    }


