class Shape{
    public void draw(){
    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}


public class TestDemo1 {

    public static void drawMap(Shape shape) {
          shape.draw();    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();
        drawMap(shape1);
        drawMap(shape2);

    }
}
