
 class OuterClass{

    public int data1=999;
    private int data2;
    public static int data3;
    public void func(){

    }
    class InnerClass{//实例内部类,不能定义static静态成员变量
//若要定义使用 public static final-》且要定义好值
        public int data1=100;
        private int data5;
        public static final int data6 = 10;
        public void func2(){
            System.out.println(OuterClass.this.data1);
            System.out.println(data2);
            System.out.println(data3);

            System.out.println(data5);
            System.out.println(data6);
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {


    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    innerClass.func2();
   }
}
