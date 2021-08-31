package impl;

public class TestCase {

    public static void main(String[] args) {
        Deque deque = new LinkedList();

        deque.offerLast(5);
        deque.offerLast(4);
        deque.offerLast(3);
        deque.offerLast(2);
        deque.offerLast(1);
//        System.out.println(deque.peek());
//        System.out.println(deque.peek());
//
//        System.out.println(deque.poll());
//        System.out.println(deque.poll());
//        System.out.println(deque.poll());
//        System.out.println(deque.poll());
//        System.out.println(deque.poll());

        deque = new LinkedList();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        System.out.println(deque.element());
        System.out.println(deque.element());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
    }
}
