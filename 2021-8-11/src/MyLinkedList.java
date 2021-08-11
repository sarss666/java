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

    public void display2(Node newHead){

        Node cur = newHead;
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
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
       return false;
    }

    public void removeAllKey(int key){
        if(this.head == null)return;
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null){
            if(cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key){
            this.head = this.head.next;
        }

    }

    public Node reverseList(){
        Node newHead = null;
        Node cur = this.head;
        Node prev = null;

        while (cur != null){
            Node curNext = cur.next;
            if(curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public Node middleNode(){
        Node slow = this.head;
        Node fast = this.head;
        while (fast !=null && fast.next !=null){
            fast =fast.next.next;
            slow =slow.next;
        }
        return slow;
    }
   public Node FindKthToTail(int k){
        if (k <= 0 || head == null){
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k-1 >0){
            if(fast.next != null){
                fast =fast.next;
                k--;
            }else {
                System.out.println("k的值过大");
                return null;
            }

        }
        while (fast.next != null){
            fast =fast.next;
            slow =slow.next;
        }
        return slow;
   }

    public Node partition( int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null){
            if(cur.data < x){

                if(bs == null){
                    bs = cur;
                    be =bs;
                }else {
                   be.next = cur;
                   be = cur;
                }
            }else {

                if (as == null){

                    as = cur;
                    ae = as;
                }else {
                    ae.next = cur;
                    ae = cur;
                }
            }
            cur =cur.next;
        }
        if(bs == null){
            return as;
        }
        be.next = as;
        if(as != null){
            ae.next =null;
        }
        return bs;
    }
    public Node deleteDuplication() {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        Node cur = this.head;
        while (cur != null){
            if(cur.next != null &&cur.data == cur.next.data){
                while (cur.next != null &&cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {tmp.next  = cur;
            tmp = cur;
            cur = cur.next;

            }
        }
        tmp.next = null;
        return  newHead.next;

    }

    public boolean chkPalindrome(){
        if(this.head == null){
            return false;
        }
        if (this.head.next == null){
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while (cur != null){
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while (this.head != slow){
            if(this.head.data != slow.data){
                return false;
            }
            if (this.head.next == slow){
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }
    public boolean hasCycle(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }

         return  false;
    }
}

