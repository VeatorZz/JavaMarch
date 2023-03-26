package Queue;

public class LinkedList {
    class Node{
        public  int val;
        public  Node next;
        public  Node(int val){
            this.val =val;
        }
    }
    public Node head;
    public Node last;
    public int UsedSize;
    public void offer(int val){
        Node node =new Node(val);
        if(head == null){
            head =node;
            last =node;
        }else{
            last.next =node;
            last =node;
        }
        UsedSize++;

    }
    public  int  poll(){
        if(isEmpty()){
            throw  new NullPointerException("没有呀");
        }
        int val=head.val;
        head=head.next;
        if (head ==null){
            last =null;
        }
        UsedSize--;
      return val;

    }

    public int peek(){
        if(isEmpty()){
            throw  new NullPointerException("没有呀");
        }
        return head.val;
    }
    public  boolean isEmpty(){
       return UsedSize==0;
    }
}
