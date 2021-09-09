import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static void insertSort(long[] array){

        for (int i = 0; i < array.length-1; i++) {

            long key = array[i + 1];
            int j;
            for (j = i; j >= 0; j--) {
                if(key < array[j]){
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = key;

        }
    }
    public static long[] 构建随机数组(){

        Random random = new Random(20201018);
        long[] array = new long[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void bubbleSort(long[] array){

        for (int i = 0; i < array.length-1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j + 1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }
    public static void selectSort(long[] array){

        for (int i = 0; i < array.length-1; i++) {
            int maxIndex = 0;

            for (int j = 1; j < array.length-i; j++) {
                if (array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }

            swap(array,maxIndex,array.length-i-1);

        }
    }

    public static long[] 构建有序数组(){
        long[] array = 构建随机数组();
        Arrays.sort(array);
        return array;
    }
    private static void swap(long[] array,int i, int j){
        long t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    public static long[] 构建逆序数组(){
        long[] array = 构建有序数组();
        swap(array,0,9);
        swap(array,1,8);
        swap(array,2,7);
        swap(array,3,6);
        swap(array,4,5);
        return array;
    }
    public static void heapSort(long[] array){
        createHeap(array,array.length);
        for (int i = 0; i < array.length-1; i++) {
            swap(array,0, array.length-i-1);
            adjustDown(array,array.length-i-1,0);
        }
    }
    private static void adjustDown(long[] array,int size,int index) {
     while (2 * index + 1 <size){
         int maxIndex = 2 * index +1;
         if (maxIndex + 1 <size && array[maxIndex+1] > array[maxIndex]){
             maxIndex++;
         }
         if (array[index] >= array[maxIndex]){
             break;
         }
         swap(array,index,maxIndex);
         index = maxIndex;
        }

    }

    private static void createHeap(long[] array,int size){
        int lastIndex = size - 1;
        int lastParentIndex = (lastIndex - 1)/2;
        for (int i = lastParentIndex; i >= 0 ; i--) {
            adjustDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        long[] a1 = 构建随机数组();
        System.out.println(Arrays.toString(a1));
        heapSort(a1);
        System.out.println(Arrays.toString(a1));

//        a1 = 构建逆序数组();
//        System.out.println(Arrays.toString(a1));
//        insertSort(a1);
//        System.out.println(Arrays.toString(a1));
    }
}
