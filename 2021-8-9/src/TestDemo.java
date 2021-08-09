public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addFirst(1);
//        myLinkedList.addFirst(2);
//        myLinkedList.addFirst(3);
//        myLinkedList.addFirst(4);
//        myLinkedList.display();
//        myLinkedList.addLast(1);
//        myLinkedList.addLast(2);
//        myLinkedList.addLast(3);
//        myLinkedList.addLast(4);
//        myLinkedList.display();

//        myLinkedList.addIndex(0,1);
//        myLinkedList.addIndex(1,2);
//        myLinkedList.addIndex(0,3);
//        myLinkedList.display();


        myLinkedList.addFirst(6);
        myLinkedList.addLast(1);
        myLinkedList.addFirst(4);
        myLinkedList.addLast(8);
        myLinkedList.display();
        myLinkedList.remove(1);
        myLinkedList.display();

    }
}
