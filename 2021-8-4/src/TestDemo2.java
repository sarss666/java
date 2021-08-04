import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Person{
    public int age=10;
    public String name="wtf";
    public static int count;
    public void eat(){
        int a = 10;
        System.out.println("吃饭");
    }
    public void  sleep(){
        System.out.println("睡觉");
    }
      public void show(){
          System.out.println("我叫"+name+",今年"+age+"岁");
      }
}


public class TestDemo2 {

    public static void main(String[] args) {

        Person person1 =new Person();
           person1.count++;
        System.out.println(person1.count);

        //System.out.println(person1.name);
        Person person2 =new Person();
            person2.count++;
        System.out.println(person2.count);

//        Person person3 =new Person();
//        Person person4 =new Person();
//        Person person =new Person();
//        System.out.println(person.name);
//        System.out.println(person.age);
//        person.sleep();
//        person.eat();
//        person.show();
    }
}
