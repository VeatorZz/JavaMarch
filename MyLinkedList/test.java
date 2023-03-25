package MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(23);
        myLinkedList.addFirst(34);
        myLinkedList.addFirst(45);
        myLinkedList.addFirst(56);
        myLinkedList.addFirst(23);
        myLinkedList.display();
        myLinkedList.addIndex(3,21);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(45));
        myLinkedList.removeAll(23);
        myLinkedList.display();
        LinkedList<Integer> linkedList =new LinkedList<>();
        linkedList.add(12);
        linkedList.add(12);
        linkedList.add(12);
        linkedList.add(12);
        linkedList.add(12);
        System.out.println(linkedList);
        linkedList.r
        Iterator<Integer> iterator=linkedList.iterator();
        while(iterator.hasNext()){
            //不仅会打印下一个  还会让it往后走一步
            System.out.println();
        }
        ListIterator<Integer> listIterator1=linkedList.listIterator(linkedList.size());
        while(listIterator1.hasPrevious()){
            System.out.println(listIterator1.previous());
        }
    }
}
