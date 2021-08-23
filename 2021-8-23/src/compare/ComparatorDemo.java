package compare;

import java.util.Comparator;

class ByHeightComparator implements Comparator<Teacher2>{
    @Override
    public int compare(Teacher2 o1, Teacher2 o2) {
        return o1.height - o2.height;
    }
}
class ByWeightComparator implements Comparator<Teacher2>{
    @Override
    public int compare(Teacher2 o1, Teacher2 o2) {
        return o1.weight - o2.weight;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Teacher2 t1 = new Teacher2("高博",18,190,80);
        Teacher2 t2 = new Teacher2("陈沛鑫",38,170,100);

        Comparator<Teacher2> byHeight = new ByHeightComparator();
        Comparator<Teacher2> byWeight = new ByWeightComparator();

        int r;
        r = t1.compareTo(t2);
        System.out.println(r);
        r = byHeight.compare(t1,t2);
        System.out.println(r);
        r = byWeight.compare(t1,t2);
        System.out.println(r);

    }
}
