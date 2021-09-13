package usejdk;

import java.util.*;

public class 使用JDK提供的排序 {
public static String[] names = { "A","B","C","D","E","F","G","H","I","J"};
public static Person[] createPersonArray(){
    Person[] personArray = new Person[10];
    for (int i = 0; i < 10; i++) {
        personArray[i] =new Person();
    }
    List<String> nameList = new ArrayList<>(Arrays.asList(names));
    Collections.shuffle(nameList );
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
        personArray[i].name = nameList.remove(0);
        personArray[i].age = random.nextInt(30) + 5;
        personArray[i].height = random.nextInt(100) + 100;
        personArray[i].weight = random.nextInt(100) + 100;


    }
    return personArray;
}
    public static void main(String[] args) {
        Person[] personArray = createPersonArray();
        Arrays.sort(personArray, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(Arrays.toString(personArray));
    }
}
