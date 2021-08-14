interface Shape3{//里面不能有具体实现的方法;但如果被default所修饰就可以使用
    int a = 0;//所有的成员变量默认是 public static final
    public abstract void draw();//所有方法默认是public abstract
    //接口也不可以被实例化
    default void func(){
        System.out.println("default::func");
    }
}
interface IA{
    void funcA();
}
interface IB{
    void funcB();

}
interface ID extends IA,IB{//接口可以拓展其他接口的方法，间接的改善了java只能继承一个类的局限性
    void funcD();
}

class Demo implements IA,IB{//一个类可以实现多个接口
    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}
class Cycle3 implements Shape3{
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}



 class TestDemo3 {
     public static void drawMap(Shape3 shape3) {
         shape3.draw();    }

     public static void main(String[] args) {
         Shape3 shape3 = new Cycle3();
         drawMap(shape3);//引用的对象一定是实现了接口的
//         Cycle3 t = new Cycle3();
         shape3.func();

     }
}
