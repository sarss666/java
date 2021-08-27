package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacityDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(100);
        list.set(98,"hello");//下标只与元素个数有关，和顺序表的空间大小无关
        System.out.println(list);
    }
}
