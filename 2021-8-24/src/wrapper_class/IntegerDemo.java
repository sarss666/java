package wrapper_class;

public class IntegerDemo {

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 200;
        if(a ==b){}//错
        if(a.equals(b)){ }//对
    }
    public static void main3(String[] args) {
        Integer aBox = 100;
        int a = aBox.intValue();
        int b = aBox;
        if(aBox > 1000){//aBox隐含aBox.intValue

        }
    }

    public static void method(Integer i) {


    }
    public static void main2(String[] args) {
        int a = 100;
        Integer aBox = a;
        Integer bBox = 100;
        Integer cBox = new Integer(100);
        method(100);
        method(a);
    }
    public static void main1(String[] args) {
        int a =100;

        System.out.println(a);

        Integer aBox = new Integer(a);
        System.out.println(aBox);

        a = 200;
        System.out.println(a);
        //包装好后的a不再受外界变化的影响
        System.out.println(aBox);
    }
}
