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
        ListNode listNode6 = new ListNode(23);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
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
    public  void func2(int k)/**快慢指针法**/{
        if(k<= 0||k>size()){
            System.out.println("你tm劈我瓜是吧");
        }
        if(head == null){

        }
        ListNode fast =head;
        ListNode slow =head;
        int m =k-1;
        while(m-->0){
            fast=fast.next;
        }
        while(fast.next !=null){
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println(slow.val);
    }
    public  void func1 (int k)/**输入倒数第K个**/{
        reverselist();
        ListNode cur =head;
        while(--k>0){
            
            cur =cur.next;
        }
        System.out.println(cur.val);
        reverselist();
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
        while (contains(key)) {
            if (this.head == null) {
                return;
            }
            if (head.val == key) {
                head = head.next;
            }
            ListNode cur = this.head;
            while (cur.next != null) {
                if (cur.next.val == key) {
                    cur.next = cur.next.next;
                    break;
                }
                cur = cur.next;

            }
            System.out.println("你输入的啥JB玩意,没有!");

        }
    }

    public void remove2(int key) {
        if (this.head == null) {
            return;
        }
        if (head.val == key) {
            head = head.next;
        }
        ListNode cur = this.head.next;
        ListNode pre = this.head;
        while (cur != null) {
            if (cur.val == key) {
                pre.next = cur.next;
                cur = pre.next;
            }
            cur = cur.next;
            pre = pre.next;
        }
        System.out.println("你输入的啥JB玩意,没有!");
    }

    public ListNode clear() {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }

    public ListNode reverselist(){
        if(head == null){
            return null;
        }
        if(head.next ==null){
            return  head;
        }
        ListNode cur =head.next;
        head.next =null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next =head;
            head =cur;
            cur= curNext;
        }
        return head;
    }
    public ListNode middleNode(){
        ListNode fast =head;
        ListNode slow =head;
        while(fast != null && fast.next != null){
            fast =fast.next.next;
            slow =slow.next;
        }
        return slow;
    }
}








