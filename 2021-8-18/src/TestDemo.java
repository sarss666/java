import java.util.Scanner;

public class TestDemo {

    public static boolean isAdmin(String useId){
        return useId.toLowerCase() == "Admin";
    }


    public static String reverse(String str,int begin,int end){
        char[] ch = str.toCharArray();
        while (begin < end){
            char tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;

        }
        return String.copyValueOf(ch);
    }
    public static String reversek(String str,int k ){
        if(str == null || k <= 0 || k >= str.length()){
            return null;
        }
        str = reverse(str,0,k-1);
        str = reverse(str,k,str.length()-1);
        str = reverse(str,0,str.length()-1);

        return str;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String  str = scanner.next();
        String ret = reversek(str,k);
        System.out.println(ret);

    }
}


//    public static void main(String[] args) {
//
//        String str = "abcdef";
//        String ret = reverse(str,3,str.length()-1);
//        System.out.println(ret);
//    }
//}
