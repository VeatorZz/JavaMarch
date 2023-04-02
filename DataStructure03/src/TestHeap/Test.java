package TestHeap;

import javax.rmi.CORBA.StubDelegate;
import java.util.Comparator;
import java.util.PriorityQueue;
class Student implements  Comparable<Student>{
    public int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return o.age-this.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
class  IntCmp implements  Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
public class Test  {
    public static void main(String[] args) {
        IntCmp intCmp =new IntCmp();
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>(intCmp);
        priorityQueue.offer(21);
        priorityQueue.offer(42);` 
    }
        public static void main4(String[] args) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }) ;
        priorityQueue.offer(12);
        priorityQueue.offer(3);
        priorityQueue.offer(78);
        priorityQueue.offer(14);
        System.out.println(priorityQueue);



    }
    public static void main3(String[] args) {
        PriorityQueue<Student> priorityQueue =new PriorityQueue<>();
        priorityQueue.offer(new Student(12));
        priorityQueue.offer(new Student(7));
        priorityQueue.offer(new Student(10));
        System.out.println(priorityQueue);
    }
    public static void main2(String[] args) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>();
        priorityQueue.offer(12);
        priorityQueue.offer(3);
        priorityQueue.offer(78);
        priorityQueue.offer(14);
        int tmp =priorityQueue.peek();
        System.out.println(tmp);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
    public static void main1(String[] args) {
        TestHeap testHeap =new TestHeap();
        int[] array={27,15,19,18,34,65,49,25,37,28};
        testHeap.createHeap(array);
        testHeap.push(80);
        System.out.println();
        for (int i = 0; i < testHeap.elem.length; i++) {
            System.out.print(testHeap.elem[i]+" ");
        }

    }
}
