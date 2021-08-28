package int_type;

public class ArrayListTestCase {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("list ="+list);
        System.out.println("size ="+list.size());
        list.add(0,100);
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());

        list.add(5,200);
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());

        try {
            list.add(-1,300);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            list.add(7,300);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        list.remove(3);
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());

        System.out.println(list.remove((Integer) 100));
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());

        System.out.println(list.remove((Integer) 100));
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());

        System.out.println(list.get(0));
        try {
            list.get(-1);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            list.get(4);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(list.get(3));

        System.out.println(list.set(3, 2000));
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());
        list.add(11);
        System.out.println("list ="+list);
        System.out.println("size ="+list.size());
        list.add(1);
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        System.out.println(list.indexOf(99));
        System.out.println(list.lastIndexOf(99));

        System.out.println(list.contains(1));
        System.out.println(list.contains(99));

        List list2 =new ArrayList(list);
        System.out.println("list ="+list);
        System.out.println("list.size ="+list.size());
        System.out.println("list2 ="+list2);
        System.out.println("list2.size ="+list.size());

        List list3 = list;
        list3.set(0,1000);
        System.out.println("list ="+list);
        System.out.println("list2 ="+list2);
        System.out.println("list3 ="+list3);


    }
}
