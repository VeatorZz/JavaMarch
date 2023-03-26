package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(12);
        queue.offer(23);
        queue.offer(34);
        queue.offer(45);
        queue.offer(78);
        int val = queue.peek();
        System.out.println(val);

    }
}
