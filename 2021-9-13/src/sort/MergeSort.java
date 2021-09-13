package sort;

public class MergeSort {
    public static void mergeSort(int[] data,int left,int right){ //left,right均为数字元素下标
        if(left<right){
            int half=(left+right)/2;
            mergeSort(data,left,half);
            mergeSort(data,half+1,right);
            merge(data,left,right);
        }
    }
    public static void merge(int []a,int l,int h){
        int mid=(l+h)/2;
        int i=l;
        int j=mid+1;
        int count=0;
        int temp[]=new int[h-l+1];
        while(i<=mid&&j<=h){
            if(a[i]<a[j]){
                temp[count++]=a[i++];
            }else{
                temp[count++]=a[j++];
            }
        }
        while(i<=mid){
            temp[count++]=a[i++];
        }
        while(j<=h){
            temp[count++]=a[j++];
        }
        count=0;
        while(l<=h){
            a[l++]=temp[count++];
        }
    }
    public static void printArray(int arr[]){
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+"\t");
        }
    }
    public static int[] getArray(){
//      int[] data={4,2,3,1};
        int[] data={1,3,4,5,6,8,9,7,2,0};;
        return data;
    }

    public static void main(String args[]){
        int[]a=getArray();
        System.out.print("数组排序前：");
        printArray(a);
        System.out.print("\n");
        mergeSort(a,0,a.length-1);
        System.out.print("归并排序后：");
        printArray(a);
    }
}

//public class sort.MergeSort {
//
//    public static void mergeSort(long[] array) {
//        mergeSortInternal(array,0,array.length);
//
//    }
//    private static void mergeSortInternal(long[] array,int lowIndex,int highIndex){
//        int size = highIndex - lowIndex;
//        if (size <= 1){
//            return;
//        }
//        int middleIndex = (lowIndex + highIndex) / 2;
//
//        mergeSortInternal(array,lowIndex,middleIndex);
//        mergeSortInternal(array,middleIndex,highIndex);
//
//        合并两个有序区间(array,lowIndex,middleIndex,highIndex);
//    }
//    public static void 合并两个有序区间(long[] array,int lowIndex,int highIndex,int middleIndex){
//        int size = highIndex - lowIndex;
//        long[] extraArray = new long[size];
//
//        int leftIndex = lowIndex;
//        int rightIndex = middleIndex;
//        int extraIndex = 0;
//
//        while (leftIndex < middleIndex && rightIndex < highIndex){
//            if (array[leftIndex] <= array[rightIndex] ){
//                extraArray[extraIndex] = array[leftIndex];
//                extraIndex++;
//                leftIndex++;
//            }else {
//                extraArray[extraIndex] = array[rightIndex];
//                extraIndex++;
//                rightIndex++;
//            }
//        }
//
//        if (leftIndex < middleIndex){
//            while (leftIndex < middleIndex){
//                extraArray[extraIndex++] = array[leftIndex++];
//            }
//        }else {
//            while (rightIndex < highIndex){
//                extraArray[extraIndex++] = array[rightIndex++];
//            }
//        }
//
//        for (int i = 0; i < size; i++) {
//            array[i + lowIndex] = extraArray[i];
//
//        }
//    }
//}
