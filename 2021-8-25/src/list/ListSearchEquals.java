package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListSearchEquals {
static class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

}

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person(1,"高博");
        Person p2 = new Person(1,"高博");
        Person p3 = new Person(3,"陈沛鑫");
        Person p4 = new Person(4,"陈沛鑫");

        list.add(p1);
        System.out.println(list);
        System.out.println(list.contains(p1));
        System.out.println(list.contains(p2));
        System.out.println(list.indexOf(p2));
        System.out.println(list.lastIndexOf(p2));
        System.out.println(list.contains(p3));
        //复写equals前 true false -1 -1 false
        //复写equals前 true true -1 -1 false

    }

}
