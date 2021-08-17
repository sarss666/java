import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class TestDemo1 {


    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(str.toUpperCase());
        String str1 = str.toUpperCase();
        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat("wtf"));
        String str3 = "";
        System.out.println(str3.isEmpty());
        String str5 = "adfdffd";
        System.out.println(str5.length());

//        String str4 = null;
//        System.out.println(str4.isEmpty());


//        String str = "    abcd   dfgfgfg    ";
//        System.out.println(str);//去掉字符串左右空格
//        System.out.println(str.trim());
    }
    public static String func(String str){

        String ret = "";
        String[] s = str.split(" ");
        for (String sss:s) {
            ret += sss;

        }
       return ret;
    }
    public static void main5(String[] args) {
     Scanner scanner= new Scanner(System.in);
     String str = scanner.nextLine();
     String ret = func(str);
        System.out.println(ret);



//        String str = "Java#30-split#bit";
//        String[] ret = str.split("-");
//
//        for (String s:ret) {
////            System.out.println(s);
//            String[] ss = s.split("#");
//            for (String sss:ss){
//                System.out.println(sss);
//            }
//        }

//        String str = "Java 30-split#bit";
//        String[] ret = str.split(" |-|#");
//
//        for (String s:ret) {
//            System.out.println(s);
//
//        }
//        String str = "192.168.0.1";
//        String[]strings = str.split("\\.");
//        for (int i = 0; i < strings.length ; i++) {
//            System.out.println(strings[i]);

//        String str = "192-168-0-1";
//        String[]strings = str.split("-");
//        for (int i = 0; i < strings.length ; i++) {
//            System.out.println(strings[i]);
//        }
//        String str2 = "hello word hello bit";
//        String[] result = str2.split(" ",4);
//        for (int i = 0; i < result.length ; i++) {
//            System.out.println(result[i]);
//
//        }

    }

    public static void main4(String[] args) {
        String str1 = "abcdef";
        System.out.println(str1.contains("bcde"));
        System.out.println(str1.indexOf("cdef"));
        System.out.println(str1.lastIndexOf("bcd"));
        System.out.println(str1.startsWith("a"));
        System.out.println(str1.endsWith("ef"));
        System.out.println(str1.replaceAll("ab", "hh"));
    }

    public static void main3(String[] args) {
        String str1 = "abcdef";
        String str2 = "Abcdef";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写
        System.out.println(str1.compareTo(str2));


    }

    public static void main2(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {87,98,99,100};
        String str =new String(bytes);
        System.out.println(str);

        String str2 = "王腾飞";
        byte[] bytes1 = str2.getBytes("utf8");
        System.out.println(Arrays.toString(bytes1));
    }

    public static boolean isNumber(String str) {
        for (int i = 0; i <str.length() ; i++) {
           char ch = str.charAt(i);
           if (ch <'0' || ch > '9') {
         return false;
           }
        }
        return true;
    }
    public static void main1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isNumber(str));

//        String str1 = "123456";
//        char ch[] = str1.toCharArray();
//        System.out.println(Arrays.toString(ch));


        }

    }

