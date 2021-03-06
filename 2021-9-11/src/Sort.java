public class Sort {


    public static void quickSort(long[] array){
        quickSortInternal(array,0,array.length-1);
    }

    public static void quickSortInternal(long[] array,
                                         int lowIndex,
                                         int highIndex) {
        int size = highIndex - lowIndex + 1;
        if (size <= 1){
            return;
        }
        int keyIndex = partition(array,lowIndex,highIndex);
        quickSortInternal(array,lowIndex,keyIndex - 1);
        quickSortInternal(array,keyIndex + 1,highIndex);

    }
    public static int partition(long[] array,int lowIndex,int highIndex){
        return partition前后(array,lowIndex,highIndex);
    }

    public static void swap(long[] array,int index1,int index2){
        long t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;
    }
    public static int partition挖坑法(long[] array,int lowIndex,int highIndex){
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        long key = array[lowIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            while (leftIndex < rightIndex && array[leftIndex] <= key){
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }
        array[leftIndex] = key;
        return leftIndex;
    }
    public static int partition前后(long[] array,int lowIndex,int highIndex) {
    int separateIndex = lowIndex + 1;
        for (int i = lowIndex + 1; i <= highIndex; i++) {
            if (array[i] < array[lowIndex]){
                swap(array,i,separateIndex);
                separateIndex++;
            }
        }
        swap(array,lowIndex,separateIndex - 1);
        return separateIndex - 1;
    }
        public static int partitionHover(long[] array,int lowIndex,int highIndex){
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        long key = array[lowIndex];

        while (leftIndex < rightIndex){
            while (leftIndex < rightIndex && array[rightIndex] >= key){
                rightIndex--;
            }
            while (leftIndex < rightIndex && array[leftIndex] <= key){
                leftIndex++;
            }
            swap(array,leftIndex,rightIndex);
        }
        swap(array,lowIndex,leftIndex);
        return leftIndex;
    }

}
