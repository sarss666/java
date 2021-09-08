public class Heap {

    public static void adjustDown(int[] array,int size,int index) {
        while (true) {
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {
                return;
            }

            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }
            if (array[index] <= array[minIndex]) {
                return;
            }
            int t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            index = minIndex;
        }

    }

    public static void createHeap(int[] array,int size){
        int lastIndex = size - 1;
        int lastParentIndex = (lastIndex - 1)/2;
        for (int i = lastParentIndex; i >= 0 ; i--) {
            adjustDown(array,size,i);
        }
    }
    public static void adjustUp(int[] array,int size,int index) {
        while (true){
            if (index == 0){
                break;
            }
            int parentIndex = (index-1)/2;
            if (array[parentIndex] <= array[index]){
                    break;
            }
            int t = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = t;
            index = parentIndex;

        }
    }
}
