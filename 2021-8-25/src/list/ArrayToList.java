package list;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[] sArray= {"Hello","World","中国"};

        List<String> s = Arrays.asList(sArray);
        System.out.println(s );
        System.out.println(s.getClass());
    }
}
