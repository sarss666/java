package linkedlist;

public class LinkedList implements List{
    public Node head;//指向的第一个元素
    public Node last;//最后一个元素
    public int size;


    @Override
    public boolean add(Integer e) {

        Node newNode = new Node(e);
        if(size == 0){
            this.head = this.last = newNode;
        }else {
            this.last.next = newNode;
            newNode.prev = this.last;
            this.last = newNode;
        }
        this.size++;
        return  true;

    }

    @Override
    public void add(int index, Integer e) {

        if(index < 0 || index > size){
            throw new  IndexOutOfBoundsException("下标越界:"+index);
        }


        if (index == size){
            add(e);
        }else if(index == 0){
            Node newNode = new Node(e);
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
            size++;
        }else {

            Node prev ;
            if(index - 1 < size/2){
                prev = head;
                for (int i = 0; i < index-1; i++) {
                    prev = prev.next;

                }
            }else {
                 prev = last;
                for (int i = 0; i < size-index; i++) {
                    prev = prev.prev;
                }
            }

            Node next = prev.next;
            Node newNode = new Node(e);
            newNode.prev = prev;
            newNode.next = next;
            prev.next = newNode;
            next.prev = newNode;
            size++;

        }
    }

    @Override
    public Integer remove(int index) {
        if(index < 0 || index > size){
            throw new  IndexOutOfBoundsException("下标越界:"+index);
        }
        Integer v;
        if(index == 0){
            v = head.element;
            this.head = this.head.next;
            this.head.prev = null;
            size--;
            if(size == 0){
                last = null;
            }
        }else if(index == size-1){
            v = last.element;
            this.last = this.last.prev;
            this.last.next = null;
            size--;
            if(size == 0){
                head = null;
            }
        }else {
            Node prev ;
            if(index - 1 < size/2){
                prev = head;
                for (int i = 0; i < index-1; i++) {
                    prev = prev.next;

                }
            }else {
                prev = last;
                for (int i = 0; i < size-index; i++) {
                    prev = prev.prev;
                }
            }

            Node toRemove = prev.next;
            v = toRemove.element;
            prev.next = toRemove.next;
            toRemove.next.prev = prev;
            size--;

        }
        return v;
    }

    @Override
    public boolean remove(Integer e) {
        Node prev = null;
        for(Node cur = head; cur != null;prev = cur,cur = cur.next){
            if(cur.element.equals(e)){
                if(prev == null){
                    remove(0);
                    return true;
                }else {
                    prev.next.next.prev = prev;
                    prev.next = prev.next.next;
                    size--;
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public Integer get(int index) {
        if(index < 0 || index > size){
            throw new  IndexOutOfBoundsException("下标越界:"+index);
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.element;
    }

    @Override
    public Integer set(int index, Integer e) {
        if(index < 0 || index > size){
            throw new  IndexOutOfBoundsException("下标越界:"+index);
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
       Integer v = cur.element;
        cur.element = e;
        return v;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) != -1;
    }

    @Override
    public int indexOf(Integer e) {
        int i = 0;
        for(Node cur = head; cur != null;cur = cur.next,i++) {
            if(cur.element.equals(e)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        int i = size-1;
        for(Node cur = last; cur != null;cur = cur.next,i--){

            if(cur.element.equals(e)){
                return i;
            }
        }
        return -1;
    }

     @Override
    public Iterator iterator() {
        return new LinkedListIterator(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Node cur = head;cur != null;cur = cur.next){
            sb.append(cur.element);
            if(cur != last){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
