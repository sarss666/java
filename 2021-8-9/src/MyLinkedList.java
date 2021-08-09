class Node{
    public int data;
    public Node next;

    public Node(int data){

        this.data = data;
    }

}


public class MyLinkedList {

    public Node head;//标识单链表的头节点

    public void addFirst(int data){
        Node node =new Node(data);

//        if(this.head == null){
//            this.head = node;
//
//        }else {
//            node.next = this.head;
//            this.head = node;
//        }
        node.next = this.head;
        this.head = node;
    }

    public void display(){

        Node cur = this.head;
        while ( cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public  void  addLast(int data){
        Node node =new Node(data);
        if(this.head == null){
            this.head = node;
        }else {
            Node cur = this.head;
             while (cur.next != null){
                 cur = cur.next;
             }
            cur.next = node;
        }
    }

    public boolean checkIndex(int index){
        if(index < 0 ||index >getLength()){
            System.out.println("下标不合法");
            return false;
        }
        return true;
    }
    public void addIndex(int index,int data){
        if(!checkIndex(index)){
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == this.getLength()){
            addLast(data);
            return;
        }
        Node cur = searchPrev(index);
        Node node = new Node(data);
         node.next = cur.next;
        cur.next = node;
    }

    public Node searchPrev(int index){
        Node cur = this.head;
        int count = 0;
        while (count < index-1){
            cur = cur.next;
            count++;
        }
        return cur;
    }

    public int getLength(){
         int count = 0;
         Node cur = this.head;
         while (cur != null){
             count++;
             cur = cur.next;
         }
         return count;
    }

    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {

            if (cur.next.data == key) {
               return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    public void remove(int key){

        if(this.head ==null) {
            return;
        }
        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }
        Node cur =searchPrevNode(key);
        if(cur == null){
            System.out.println("没有你要删除的数字");
            return;
        }
        Node del = cur.next;
        cur.next = del.next;

    }
}

