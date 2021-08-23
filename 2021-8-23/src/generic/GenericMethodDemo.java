package generic;


import java.util.Arrays;
import java.util.Comparator;

public class GenericMethodDemo {
    public static void bubbleSort(int[]array ) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1 ; j++) {
                if(array[j] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
            }
                
            }
        }
    }
    public static <T> void bubbleSort(T []array, Comparator<T> comparator){

        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                int r = comparator.compare(array[j], array[j + 1]);
                if(r > 0){
                    T t = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = t;
                }
            }

        }

    }

    public static void main(String[] args) {
        {
            int[] array={1,9,3,7,7,7,12,4};
            bubbleSort(array);
            System.out.println(Arrays.toString(array));
        }
        Teacher[] teachers = {
                new Teacher("高博",18,190,80),
                new Teacher("陈沛鑫",38,170,100),
                new Teacher("汤众",16,200,90),
                new Teacher("许之琛",16,170,85)


        };
        System.out.println(Arrays.toString(teachers));
        Comparator<Teacher> byAge = new TeacherByAgeComparator();

        Comparator<Teacher> byHeight = new TeacherByHeightComparator();
        Comparator<Teacher> byName = new TeacherByNameComparator();

        GenericMethodDemo.bubbleSort(teachers,byAge);
        System.out.println(Arrays.toString(teachers));

        GenericMethodDemo.bubbleSort(teachers,byHeight);
        System.out.println(Arrays.toString(teachers));
        GenericMethodDemo.bubbleSort(teachers,byName);
        System.out.println(Arrays.toString(teachers));

        bubbleSort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if (o1.age != o2.age){
                    return o1.age - o2.age;
                }else {
                    return o1.height - o2.height;
                }

            }
        });
        System.out.println(Arrays.toString(teachers));




    }
//    {
//        Student[] students = new Student[10];
//        bubbleSort(students);
//    }
}
