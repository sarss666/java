package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
//        System.out.println(list);

        //Iterator<String> it = list.iterator();
        ListIterator<String> it = list.listIterator(list.size()-1);
        while (it.hasPrevious()){
            String previous = it.previous();
            System.out.println(previous);
        }



//        while (it.hasNext()){
//            String next = it.next();
//            if (next.equals("C")){
//                it.remove();//删除迭代到的元素
//            }
//
//        }

//        System.out.println(list);
//        for (String next:list) {
//            if(next.equals("C")){
//                list.remove("C");
//            }
//           System.out.println(list);
//
//        }
//        for (String next:list) {
//            System.out.println(next);
//
//        }
//
//        while (it.hasNext()){//调用6次，t t t t t f
//            String next = it.next();//调用5次 A B C D E F
//            System.out.println(next);
//        }

    }


}
