class OuterClass2 {

    public int data1 = 999;
    private int data2;
    public static int data6;

    public void func2(){

        int a = 10;
    }
    static class InnerClass2{
        public int data4;
        private int data1;
        public static int data6 = 8888;
        OuterClass2 out;
        public InnerClass2(OuterClass2 o){
            this.out = o;
        }
    public void func(){
        System.out.println("静态内部类:func()");
        System.out.println(this.out.data1);//静态内部类不能访问，外部类的实例化对象
        System.out.println(this.out.data2);
        System.out.println(OuterClass2.data6);
        System.out.println(data4);
        System.out.println(this.data1);
        System.out.println(data6);
    }
    }

}
public class TestDemo2 {
    public static void main(String[] args) {

  OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2(new OuterClass2());
  innerClass2.func();

    }
}
