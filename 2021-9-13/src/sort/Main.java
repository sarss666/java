package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] array = BuildArray.构建有序数组();
//        long[] array = {1,3,4,5,6,8,9,7,2,0};

        System.out.println(Arrays.toString(array));
        //sort.MergeSort.mergeSort(array);
//        sort.Sort.quickSort(array);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
