package linklist;

/**
 * 测试双链表
 */
public class TestDoubleLinkedList {
    public static void main(String[] args) {
        //创建一个双链表
        DoubleLinkList d = new DoubleLinkList();
        d.push_back(1);
        d.push_back(1);
        d.push_back(1);
        d.push_back(1);
        d.display();
        System.out.println("------------------------");
//        d.addIndex(4,99);
//        d.display();
//        System.out.println(d.contains(5));
//        d.remove(5);
//        d.removeAll(1);
//        d.display();
//        System.out.println(d.size());
        d.clear();
        d.display();
    }
}


class LinkedList {
    public int val;
    public LinkedList prev;
    public LinkedList next;
    public LinkedList(int val) {
        this.val = val;
    }
}
 class DoubleLinkList {
    public LinkedList head;
    public LinkedList last;

    //return the length of the DoubleLinkedList
    public int size() {
        LinkedList cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //Print the value of every node in the DoubleLinkedList
    public void display() {
        LinkedList cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //Check whether the DoubleLinkedList contains the given value
    public boolean containsValue(int val) {
        LinkedList cur = this.head;
        while (cur != null) {
            if (cur.val == val) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //Push a node at the first of the DoubleLinkedList
    public void push_font(int val) {
        LinkedList node = new LinkedList(val);
        if (head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.head.prev = node;
            node.next = this.head;
            this.head = node;
        }
    }

    //Push a node at the last of the DoubleLinkedList
    public void push_back(int val) {
        LinkedList node = new LinkedList(val);
        if (this.last == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //Pop the last node of the DoubleLinkedList
    public void pop_back() {
        if (this.head == null) {
            System.out.println("链表为空!无法删除!");
        } else {
            int lastValue = this.last.val;
            if (this.head == this.last) {
                this.head = null;
                this.last = null;
            } else {
                LinkedList tmp = this.last.prev;
                this.last.prev.next = null;
                this.last.prev = null;
                this.last = tmp;
            }
        }
    }

    //Pop the first node of the DoubleLinkedList
    public void pop_font() {
        if (this.head == null) {
            System.out.println("链表为空!无法删除!");
        } else {
            int firstValue = this.head.val;
            if (this.head == this.last) {
                this.head = null;
                this.last = null;
            } else {
                LinkedList tmp = this.head.next;
                this.head.next.prev = null;
                this.head.next = null;
                this.head = tmp;
            }
        }
    }

    //Return the value of the node at the specific position
    public int searchByIndex(int index) {
        if (this.head == null) {
            System.out.println("链表为空!");
            return -1;
        }
        if (index < 0 || index >= this.size()) {
            System.out.println("index 位置不合法!");
            return -1;
        } else {
            LinkedList cur = this.head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            return cur.val;
        }
    }

    //Insert a node at the DoubleLinkedList
    public void Insert(int index, int val) {
        if (index < 0 || index > this.size()) {
            System.out.println("index 位置不合法!");
            return;
        }
        LinkedList node = new LinkedList(val);
        LinkedList cur = this.head;
        if (index == 0) {
            this.push_font(val);
        } else if (index == this.size() - 1) {
            this.push_back(val);
        } else {
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            node.next = cur.next;
            cur.next.prev = node;
            node.prev = cur;
            cur.next = node;
        }
    }

    //Remove the first node with the specific value of the DoubleLinkedList
    public void removeByValue(int val) {
        LinkedList cur = this.head;
        while (cur != null) {
            if (cur.val == val) {
                if (cur == head) {
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    } else {
                        this.last = null;
                    }
                    return;
                } else {
                    cur.prev.next = cur.next;
                    if (cur == this.last) {
                        this.last = cur.prev;
                    } else {
                        cur.next.prev = cur.prev;
                    }
                    return;
                }
            } else {
                cur = cur.next;
            }
        }
    }

    //Remove all nodes with the specific value of the DoubleLinkedList
    public void removeAllByValue(int val) {
        LinkedList cur = this.head;
        while (cur != null) {
            if (cur.val == val) {
                if (cur == head) {
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    } else {
                        this.last = null;
                    }
                    cur = cur.next;
                } else {
                    cur.prev.next = cur.next;
                    if (cur == this.last) {
                        this.last = cur.prev;
                        this.last.next = null;
                    } else {
                        cur.next.prev = cur.prev;
                    }
                    cur = cur.next;
                }
            } else {
                cur = cur.next;
            }
        }
    }

    //Clear the DoubleLinkedList
    public void clear() {
        LinkedList curNext = this.head;
        while (head != null) {
            curNext = curNext.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = curNext;
        }
    }
}