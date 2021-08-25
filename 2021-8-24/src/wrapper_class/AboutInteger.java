package wrapper_class;

public class AboutInteger {
    public static void main(String[] args) {
        System.out.println(Long.toHexString(19));
        System.out.println(Long.toOctalString(19));

        String s = Long.toOctalString(19);
        long l  = Long.parseLong(s,8);
        System.out.println(l);


//        System.out.println(Integer.valueOf("1024"));
//        System.out.println(Integer.valueOf("FF", 16));
//        System.out.println(Integer.BYTES);//比特位
//        System.out.println(Integer.SIZE);//大小
//        System.out.println(Integer.MAX_VALUE);//最大值
//        System.out.println(Integer.MIN_VALUE);//最小值
//        System.out.println(new Integer(100));
//        System.out.println(new Integer("1024"));
//        Integer.compare(100,200);
//        Integer a = 100;
//        a.compareTo(200);
//        System.out.println(Integer.max(60, 30));
//        System.out.println(Integer.min(60, 30));
    }
}
