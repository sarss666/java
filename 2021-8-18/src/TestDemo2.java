

public class TestDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("helloworld");
        System.out.println(sb.delete(5, 10).insert(0,"wtf"));

//     String str = "abcd";
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        for (int i = 0; i < 10; i++) {
//            sb.append(i);
//            str = sb.toString();
//        }
//
//        System.out.println(str);
//     StringBuffer sb = new StringBuffer("abcd");
//        System.out.println(sb.append("wtf"));
//        //System.out.println(sb.reverse());
//        StringBuilder sb2 = new StringBuilder("abcd");
//        System.out.println(sb2.append("wtf"));
//        //System.out.println(sb2.reverse());

    }
}
