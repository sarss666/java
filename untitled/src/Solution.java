
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> 宝石 = new HashSet<>();
        char[] jChars = J.toCharArray();
        for (char j:jChars) {
            宝石.add(j);
        }
        int count = 0;
        char[] sChars = S.toCharArray();
        for (char s : sChars){
            if (宝石.contains(s)){
                count++;
            }
        }
        return count;

//        int b = 0;
//        for (int i = 0; i < jewels.length(); i++) {
//            for (int j = 0; j < stones.length(); j++) {
//                if (jewels.charAt(i) == stones.charAt(j)){
//                    b++;
//                }
//            }
//        }
//        return b;
    }
}
