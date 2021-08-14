class Animal2{
    public String name;

    public Animal2(String name) {
        this.name = name;
    }
}
interface IFlying{
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
class Cat2 extends Animal2 implements IRunning{
    public Cat2(String name){
        super(name);

    }

    @Override
    public void run() {
        System.out.println(this.name+"用四条腿跑");
    }
}
    public class TestDemo4 {


    public static void main(String[] args) {
     IRunning iRunning = new Cat2("mimi");
     iRunning.run();
    }
}
