public class TestDemo {
    public static void main(String[] args) {
        RealLinkedList realLinkedList =new RealLinkedList();
        realLinkedList.addFirst(1);
        realLinkedList.addFirst(2);
        realLinkedList.addFirst(3);
        realLinkedList.addFirst(4);
        realLinkedList.addFirst(5);
        realLinkedList.display();
       // realLinkedList.addLast(19);
        realLinkedList.addLast(8);
        realLinkedList.addLast(19);
        realLinkedList.display();
        realLinkedList.remove(1);
        realLinkedList.display();
        System.out.println(realLinkedList.contains(18));


    }


}
