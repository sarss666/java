import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        char[] value = {'a','b','c','d','e'};
        String str = new String(value);
        System.out.println(str);

        String str2 = new String(value,0 ,3);
        System.out.println(str2);

        String str3 = "hello";
        char ch = str3.charAt(0);
        System.out.println(ch);

        char[] ch1 = str3.toCharArray();
        System.out.println(Arrays.toString(ch1));
    }

    public static void main3(String[] args) {
//        String str1 = "abcdef";
//        String str2 = "abcdef";
//        System.out.println(str1 == str2);
//
//        String str3 = new String("abcdef") ;
//        System.out.println(str1 == str3 );
//
//        String str4 ="ab"+"cdef";
//        System.out.println(str1 == str4);
//
//        String str5 = "ab"+ new String("cdef");
//        System.out.println(str1 == str5);

        String str6 = "hel";
        String str7 = str6+"lo";
        String str8 = "hello";
        System.out.println(str7 == str8);

    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1.equals(str2));

    }
    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        char[] value = {'a','b','c','d','e'};
        String str3 = new String(value);
        String str4 = str1;



        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        str1 ="fff";
        System.out.println(str1);
        System.out.println(str4);

    }
}
