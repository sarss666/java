import java.util.Arrays;

class Student2 implements  Comparable<Student2>{
public String name;
public int age;
public double score;


    public Student2(String name,int age,double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        if (this.age > o.age) {
          return 1;
        }else if(this.age == o.age){
           return 0;
        }else {
            return -1;
        }
    }
}



public class TestDemo5 {
    public static void main(String[] args) {
        Student2 student21 = new Student2("wtf",12,100);
        Student2 student22 = new Student2("wlf",18,95);
        Student2 student23 = new Student2("shasha",10,15);
//         if(student21.compareTo(student22) < 0){
//             System.out.println("student21的年龄<student2");
//         }
        Student2[] student2s = new Student2[3];
        student2s[0] = student21;
        student2s[1] = student22;
        student2s[2] = student23;
        Arrays.sort(student2s);
        System.out.println(Arrays.toString(student2s));

    }

    public static void main1(String[] args) {
      int[] array = {12,4,89,43,56};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
