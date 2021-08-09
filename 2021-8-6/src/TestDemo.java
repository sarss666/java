

public class TestDemo {



    public static void main(String[] args) {


        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,6);
        myArrayList.display();
        myArrayList.remove(3);
        myArrayList.display();
       myArrayList.size();
        System.out.println(myArrayList.size());
//     Calculator calculator =new Calculator();
//     calculator.setNum1(10);
//     calculator.setNum2(20);
//
//        System.out.println(calculator.add());
//        System.out.println(calculator.sub());
//        System.out.println(calculator.mul());
//        System.out.println(calculator.dev());
//
//        System.out.println("======================");
//        Calculator calculator2 =new Calculator(20,60);
//
//        System.out.println(calculator2.add());
//        System.out.println(calculator2.sub());
//        System.out.println(calculator2.mul());
//        System.out.println(calculator2.dev());

    }



}
//    private static  int x=100;
//
//    public static void main(String[] args) {
//     TestDemo hs1 =new TestDemo();
//     hs1.x++;
//
//     TestDemo hs2 =new TestDemo();
//     hs2.x++;
//
//     hs1 =new TestDemo();
//     hs1.x++;
//
//     TestDemo.x--;
//     System.out.println("x="+x);
//    }

