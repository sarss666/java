public class TestDemo {

       public static  int jumpFlor(int n){
           if(n <= 0){
               return -1;
           }
           if(n == 1){
               return 1;
           }
           if(n == 2){
               return 2;
           }
           return  jumpFlor(n-1)+jumpFlor(n-2);
       }

    public static void swap(int[] array2) {
           int tmp =  array2[0];
           array2[0] = array2[1];
           array2[1] = tmp;
    }
    public static void main(String[] args) {
        int[] array = {10,20};
        System.out.println(array[0]+" "+array[1]);
         swap(array);
        System.out.println(array[0]+" "+array[1]);

        // System.out.println(jumpFlor(10));
    }
}
