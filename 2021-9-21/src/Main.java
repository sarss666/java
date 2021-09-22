import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("gb",18);
        Person p2 = new Person("gb",18);

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        System.out.println(set.contains(p2));
    }
}
