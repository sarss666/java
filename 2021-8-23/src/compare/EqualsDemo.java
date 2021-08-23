package compare;

class Teacher{

    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(!(o instanceof Teacher)){
            return false;
        }
        Teacher ob =(Teacher)o;
        return this.name.equals(ob.name);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//
//        compare.Teacher teacher = (compare.Teacher) o;
//
//        return name.equals(teacher.name);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(name);
//    }
}
public class EqualsDemo {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("高博");

        Teacher t2 = new Teacher("高博");

        Teacher t3 = new Teacher("陈沛鑫");

        Teacher t4 = new Teacher("陈沛鑫");

        System.out.println(t1.equals(t2));
        //t1指向的对象和t2指向的对象是否代表同一现实事物
        //需要开发者指导Java的
        System.out.println(t1.equals(t3));

        System.out.println(t3.equals(t4));
    }
}
