package set的使用;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("apple"));
        System.out.println(set.add("peach"));
        System.out.println(set.add("banana"));
        System.out.println(set.add("orange"));
        System.out.println("apple".compareTo("peach"));
        System.out.println("peach".compareTo("apple"));
//        System.out.println(set.size());
//        System.out.println(set);
//        System.out.println(set.add("apple"));
//        System.out.println(set.contains("watermelon"));
//
//        System.out.println(set.contains("apple"));
//        System.out.println(set.remove("watermelon"));
//        System.out.println(set.remove("peach"));
//        System.out.println(set);
//        set.clear();
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//
//
//        set.add("西瓜");
//        set.add("冬瓜");
//        set.add("南瓜");
//        set.add("北瓜");
//        set.add("地瓜");
//        set.add("傻瓜");
//        set.add("甜瓜");
//        set.add("苦瓜");
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            String fruit = iterator.next();
//            System.out.println(fruit);
//        }
    }
}
