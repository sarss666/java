class MyValue{
    public int val;
}

public class TestDemo {


        public static void swap(MyValue a, MyValue b){
            int tmp = a.val;
            a.val = b.val;
            b.val = tmp;
        }
        public static void main(String[] args) {
            MyValue myValue1 = new MyValue();
            myValue1.val = 10;

            MyValue myValue2 = new MyValue();
            myValue2.val = 20;

            System.out.println(myValue1.val);
            System.out.println(myValue2.val);

            swap(myValue1,myValue2);

            System.out.println(myValue1.val);
            System.out.println(myValue2.val);
        }
    }


