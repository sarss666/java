import java.util.Arrays;

public class TestDemo1 {

    public static void bubbleSort(int[] array){
        long start = System.currentTimeMillis();
        boolean flg = false;
        for(int i = 0;i < array.length-1;i++){
            // j<4
            for(int j = 0;j < array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    int tmp =array[j];
                    array[j] = array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void reverse(int[] array){
        int i = 0;
        int j = array.length-1;
        while (i < j){
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
       // bubbleSort(array);
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
