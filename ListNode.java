public class ListNode {
        int data;
        ListNode next;
        ListNode(int x){
            data = x;
    }

public void add(int newdata){
    ListNode newNode = new ListNode(newdata);
    if(this.next==null)
        this.next = newNode;
    else
        this.next.add(newdata);
        }
// 打印链表

    public void print(){
            System.out.print(this.data);
            if(this.next!=null){
                System.out.print("-->");
                this.next.print();
            }
    }


    public static void main(String[] args) {
            ListNode l1 = new ListNode(3);
            l1.add(5);
            l1.add(9);
            l1.add(12);
            l1.add(13);
            l1.print();
    }

    }