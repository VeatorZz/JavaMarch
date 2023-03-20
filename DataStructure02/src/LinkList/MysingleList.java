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
        public void display(){
            ListNode cur ;
            cur =this.head;
            while(cur!= null){
                System.out.print(cur.val+" ");
                cur=cur.next;
            }
            System.out.println();
        }
        public boolean contains(int key){
            ListNode cur =this.head;
            while(cur != null){
                if (cur.val == key){
                    return true;
                }
                cur=cur.next;
            }
            return false;
        }
    }







