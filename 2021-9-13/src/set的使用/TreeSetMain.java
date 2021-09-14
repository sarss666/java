package set的使用;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("apple");
        list.add("apple");
        list.add("apple");
        list.add("apple");
        list.add("apple");
        list.add("peach");
        list.add("orange");

        Set<String> set = new TreeSet<>(list);
        System.out.println(set);
    }
}
