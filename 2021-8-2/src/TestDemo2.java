import java.util.Arrays;

public class TestDemo2 {

    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            int mid =(left+right)>>>1;
            if(array[mid] > key){
                right = mid-1;
            }else if(array[mid] <key){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] array = {1,12,31,44,51};
      Arrays.sort(array);
      int index = Arrays.binarySearch(array,44);
        System.out.println(index);
    }
}
