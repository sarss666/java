package compare;

class Teacher2 implements Comparable<Teacher2>{
    String name;
    int age;
    int height;
    int weight;

    @Override
    public int compareTo(Teacher2 o) {
        return age - o.age;
    }


    public Teacher2(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Teacher2 t1 = new Teacher2("高博",18,190,80);
        Teacher2 t2 = new Teacher2("陈沛鑫",38,170,100);

        int r = t1.compareTo(t2);
        if(r < 0){

            System.out.println("高博小于陈沛鑫");
        }else if(r == 0){
            System.out.println("高博等于陈沛鑫");
        }else {
            System.out.println("高博大于陈沛鑫");
        }

    }
}
