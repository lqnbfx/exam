package linklist;

//建立单链表
public class SingleLinkList {
        public Node head;
        public void createLinkedList(){
            this.head = new Node(2);
            Node node2 = new Node(3);
            Node node3 = new Node(4);
            Node node4 = new Node(5);
            Node node5 = new Node(6);
            head.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = null;
        }
    //遍历单链表
    public void traverse(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
//    头插
public void addFirst(int data){
    Node node = new Node(data);
    node.next = head;
    head = node;
}

//尾插
public void addLast(int data){
    Node node = new Node(data);
    Node cur = head;
    if(cur == null){
        head = node;
    }

    while(cur.next != null){
        cur = cur.next;
    }
    cur.next = node;
}
//    清空单链表
public void clear(){
    head = null;
}


//    任意位置的插入
public void addIndex(int index,int data){
    if(index < 0 || index > size()){
        System.out.println("插入位置不合法！");
    }
    //头插
    if(index == 0){
        addFirst(data);
        return;
    }
    //尾插
    if(index == size()){
        addLast(data);
        return;
    }

    //中间插
    Node node = new Node(data);
    Node cur = head;
    int count = 0;
    while(count != index-1){
        count++;
        cur = cur.next;
    }
    node.next = cur.next;
    cur.next = node;
}

//    删除index位置的结点
public void delete(int index){
    if(index < 0 || index >= size()){
        System.out.println("删除位置不合法！");
    }
    if(index == 0){
        head = head.next;
        return;
    }
    Node cur = head;
    int count = 0;
    while(count != index-1){
        cur = cur.next;
        count++;
    }
    cur.next = cur.next.next;
}






    //    找到单链表的最后一个结点
public Node findLastNode() {
    Node cur = head;
    if (cur == null) {
        return null;
    }
    while (cur.next != null) {
        cur = cur.next;
    }
    return cur;
}
//    求链表的长度
    public int size(){
        Node cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

//    求链表的第N个结点
public Node findN(int n){
    if(head == null){
        System.out.println("单链表为空！");
        return null;
    }
    if(n <= 0){
        System.out.println("n不合法！");
    }
    if(n > size()){
        System.out.println("n不合法！");
    }
    int count = 1;
    Node cur = head;
    while(count != n){
        cur = cur.next;
        count++;
    }
    return cur;
}

//    查找关键字key是否在单链表中
public boolean findKey(int key){
    Node cur = head;
    while(cur != null){
        if(cur.val == key){
            return true;
        }
        cur = cur.next;
    }
    return false;
}

}


//创建类和构造方法
class Node{
    public int val;
    public Node next;
    public Node(){

    }
    public Node(int val){
        this.val = val;
    }
}




