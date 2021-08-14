class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name+"正在吃");
    }
}
class Cat extends Animal{
//    public String name;
    public Cat(String name){
        super(name);

    }

    public void jump( ){
        System.out.println(this.name+"正在跳");
}
    public void eat(){
        System.out.println(this.name+"正在吃猫粮");
    }
}

class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }

public void eat(){
    System.out.println(this.name+"正在大跳");
}
}
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("haha");
        cat.eat();
    }}




//    public static void func(Animal animal) {
//     animal.eat("fish");
//    }
//    public static Animal func2() {
//        Cat cat = new Cat("lala");
//        cat.eat("yu");
//        return cat;
//    }
//
//    public static void main2(String[] args) {
//        Animal animal = func2();
//
//
//
//    }
//    public static void main1(String[] args) {
//        Cat cat = new Cat("123");
//        cat.eat("fish");
//        Bird bird = new Bird("");
//
//    }
//}
