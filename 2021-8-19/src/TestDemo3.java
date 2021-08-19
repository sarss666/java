class OuterClass3 {
    public void func3(){
        System.out.println("OuterClass3的func3 ");
    }

}
public class TestDemo3 {

    public static void func2(){

        class A{

        }
    }

    public static void main(String[] args) {
        new OuterClass3(){
            public int data1;
            public void func(){
                System.out.println("我重写了OuterClass3的func");
            }
        }.func();
    }
}
