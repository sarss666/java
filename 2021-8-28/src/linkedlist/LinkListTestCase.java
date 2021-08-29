package linkedlist;

public class LinkListTestCase {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(0,998);
        list.add(31);
        list.add(32);
        list.add(33);
        System.out.println(list);

        list.add(0,1000);
        System.out.println(list);
        list.add(3,28);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
