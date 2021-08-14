
abstract class Shape2{//抽象类包含抽象方法,不能被实例化
    //抽象方法：呗abstract所修饰的方法布局体实现
    public abstract void draw();//与普通类相比多了一个抽象方法
    public  int a;
    public void func(){}//子类继承抽象类时要重写抽象类里的抽象方法；
}
class Cycle2 extends Shape2{
    @Override
    public void draw() {
        System.out.println("Cycle::⚪");
    }
}
public class TestDemo2 {
    public static void drawMap(Shape2 shape2) {
        shape2.draw();    }
    public static void main(String[] args) {

        Shape2 shape21 = new Cycle2();
        drawMap(shape21);

    }
}
