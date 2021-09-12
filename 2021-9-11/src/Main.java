import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] array = BuildArray.构建随机数组();
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
//        Sort.quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
