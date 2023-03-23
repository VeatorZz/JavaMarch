package MyLinkedList;

public class test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(23);
        myLinkedList.addFirst(34);
        myLinkedList.addFirst(45);
        myLinkedList.addFirst(56);
        myLinkedList.display();
        myLinkedList.addIndex(3,21);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(45));

    }
}
