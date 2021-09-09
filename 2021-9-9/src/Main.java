import java.util.Scanner;

public class Main{
    public static long pow(int n , int p){
        long r = 1;
        for(int i = 0; i < p; i++){
            r *= n;
        }
        return r;

    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String hexString = scanner.nextLine();
            long n = hexTo10进制(hexString);
            System.out.println(n);
        }

    }
    private static long hexTo10进制(String hexString){
        long r = 0;
        char[] chars = hexString.toCharArray();
        for (char c:chars) {
            int digit = 字符转数字(c);

            r = ( r + digit) * 16;
        }
        return  r/16;
    }
    private static int 字符转数字(char c){

        if (c >= '0' && c <= '9'){
            return c - '0';
        }else {
            return c - 'A' + 10;
        }


    }

}