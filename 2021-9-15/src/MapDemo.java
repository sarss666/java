import java.util.Map;
import java.util.TreeMap;

public class MapDemo {


    public static void main(String[] args) {
        MyTreeMap 通讯录 = new MyTreeMap();

        Integer v = 通讯录.put("cpx",123);
        System.out.println(v);
        v = 通讯录.put("cpx",456);


//        v = 通讯录.getOrDefault("gb",998);
        System.out.println(v);
        System.out.println(通讯录);
//        v = 通讯录.get("gb");
//        System.out.println(v);
//        v = 通讯录.get("gb");
//        System.out.println(v);
//        v = 通讯录.get("gb");
//        System.out.println(v);

    }
}
