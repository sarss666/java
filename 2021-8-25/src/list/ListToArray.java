package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        Object[] objects = list.toArray();
        for(Object o : objects){
            String s = (String)o;
            System.out.println(s.toLowerCase());

        }
        String[] strings = list.toArray(new String[0]);
        for (String s:strings) {
            String a = (String)s;
            System.out.println(Arrays.toString(strings));

        }


    }
}
