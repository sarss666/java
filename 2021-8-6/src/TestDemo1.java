
class MyValue{
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class TestDemo1 {

    public static void swap(MyValue myValue1,MyValue myValue2) {
        int tmp =myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(tmp);
    }

    public static void main(String[] args) {

        MyValue myValue1 =new MyValue();
        myValue1.setVal(10);

        MyValue myValue2 =new MyValue();
        myValue2.setVal(20);

        System.out.println(myValue1.getVal()+"  "+myValue2.getVal());

        swap(myValue1,myValue2);
        System.out.println(myValue1.getVal()+"  "+myValue2.getVal());
    }
}
