package use_jdk;

import java.util.Deque;
import java.util.LinkedList;

public class DequeStackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
