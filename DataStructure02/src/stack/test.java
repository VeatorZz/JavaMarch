package stack;

import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        stack.push(56);
        stack.push(78);
        int x =stack.pop();
        x = stack.pop();
        boolean flg =stack.empty();

    }
}
