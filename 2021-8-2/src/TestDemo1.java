import java.util.Arrays;

public class TestDemo1 {

    public static String myString(int[] array){
           if(array.length == 0){
               return "[]";
           }
         String ret = "[";
         for(int i = 0; i< array.length;i++){

             if(i!=array.length-1){
                 ret=ret+array[i] +", ";
             }else{
                 ret += array[i]+"]";
             }
         }
         return ret;
    }

    public static int[] copyArray(int[] array){
        int[] array2 =new int[array.length];
        System.out.println(Arrays.toString(array));
        for(int i = 0; i< array.length;i++){
            array2[i] = array[i];
        }
        return array2;
    }

    public static void main(String[] args) {
       int[] array={1,2,3,4,5};
       int[] ret=array.clone();
//          int[] ret = new int[array.length];
//        System.arraycopy(array,0,ret,0,array.length);
    System.out.println(Arrays.toString(ret));
//       int[] ret=Arrays.copyOf(array,array.length-3);
//       //int[] ret= copyArray(array);
//        System.out.println(Arrays.toString(ret));


//        int[] array = {};
//        String str = Arrays.toString(array);
//        System.out.println(str);
//        String ret = myString(array);
//        System.out.println(ret);
    }
}
