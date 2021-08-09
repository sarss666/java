
class Student{
    private String name;
     private int age;


     public Student(){
         this("bit");
     }
    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo1 {

    public TestDemo1() {
    }

    public static void main(String[] args) {

        Student student1= new Student ();
        System.out.println(student1);
//        Student student=new Student(10);
//        System.out.println(student.getAge());
//        Student student1= new Student ("wtf",10);
//        System.out.println(student1);
    }
}

