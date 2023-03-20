package LinkList;

public class MysingleList {

    static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode head;
    //表示头结点(因为没有值)

    public void creatlist() {
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(23);
        ListNode listNode3 = new ListNode(34);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(56);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        this.head = listNode1;
    }

    public void display() {
        ListNode cur;
        cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        int sum = 0;
        ListNode cur = this.head;
        while (cur != null) {
            sum++;
            cur = cur.next;
        }
        return sum;
    }

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    public void addLast(int data) {

        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

    }

    private ListNode findIndexSubOne(int index) {
        ListNode cur = head;
        while (index != 1) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    public void addIndex(int index, int data) {
        ListNode node = new ListNode(data);
        ListNode cur = findIndexSubOne(index);

        node.next = cur.next;
        cur.next = node;
    }

    public void remove(int key) {
        if(this.head == null){
            return ;
        }
        if(head.val == key){
            head =head.next;
        }
        ListNode cur =this.head;
         while(cur.next !=null){
             if(cur.next.val == key){
                 cur.next=cur.next.next;
                 break;
             }
             cur =cur.next;

         }
        System.out.println("你输入的啥JB玩意,没有!");

    }
}







