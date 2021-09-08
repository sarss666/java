package Test;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class TestDemo {
    public static Node addFirst(Node head,int e){
        Node node = new Node(e);
        if (head == null  ){
            head = node;
            return head;
        }
        node.next = head;
        head = node;
        return head;


    }
    public static Node addLast(Node head,int e){

        Node node = new Node(e);
        if (head == null){
            head = node;
            return head;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        return head;


    }


}

