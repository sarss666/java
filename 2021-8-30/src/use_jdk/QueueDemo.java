package use_jdk;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

//        System.out.println(queue.element());
//        System.out.println(queue.element());
//        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
