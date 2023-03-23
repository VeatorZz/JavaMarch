package MyLinkedList;

import LinkList.MysingleList;

public class MyLinkedList {
    static  class ListNode {
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
        public  ListNode head;
        public  ListNode last;

    public boolean contains(int key) {
       ListNode cur = head;
         while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
         }
        return false;
    }
    public void remove(int key){
        ListNode cur =head;
        while(cur!= null){
            if(cur.val ==key){
                if(cur ==head){
                    head =head.next;
                    head.prev=null;
                }else{
                    cur.prev.next =cur.next;
                    if(cur.next != null){
                        cur.next.prev=cur.prev;
                    }else {
                        last = last.prev;
                    }
                }
                return;
            }else{
                cur=cur.next;
            }
        }
    }

    public void display() {
        MyLinkedList.ListNode cur;
        cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
        public  void addFirst(int data) {
            ListNode node = new ListNode(data);
            if (this.head == null) {
                head = node;
                last = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
        }
            public  void addLast(int data) {
                ListNode node =new ListNode(data);
                if(this.head ==null){
                    head =node;
                    last =node;
                }else{
                    node.prev=last;
                    last.next=node;
                    node.next=null;
                    last=node;
                }
        }

        public ListNode searchIndex(int index){
        ListNode cur =head;
        while(index != 0){
            cur=cur.next;
            index--;
        }
        return cur;
        }

        public int size() {
        int sum = 0;
        MyLinkedList.ListNode cur = this.head;
        while (cur != null) {
            sum++;
            cur = cur.next;
        }
        return sum;
     }



        public void addIndex(int index, int data){
        if(index<0 || index > size()){
            System.out.println("不合法");
            return;
            }

        if(index ==0){
            addFirst(data);
            return ;
        }

        if(index == size()){
            addLast(data);
            return;
        }

        ListNode cur =searchIndex(index);
        ListNode node =new ListNode(data);
        node.next =cur;
        cur.prev.next=node;
        node.prev=cur.prev;
        cur.prev=node;


        }



}
