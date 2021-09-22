package 哈希表;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "azxdbcdewlafsdalfkjdofjadsfjlzjoidfjoz";
        int[] count = new int[26];
        for (char ch:s.toCharArray()) {
            int idx = ch - 'a';
            count[idx]++;
        }
        System.out.println(Arrays.toString(count));
    }


}
