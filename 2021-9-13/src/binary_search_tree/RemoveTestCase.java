package binary_search_tree;

public class RemoveTestCase {
    public static void case1(){
        BST bst = new BST();
        bst.insert(5);
        System.out.println(bst.remove(3));
    }
    public static void case2(){
        BST bst = new BST();
        bst.insert(5);
        boolean remove = bst.remove(5);
        System.out.println(remove);
    }
    public static void case3(){
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        boolean remove = bst.remove(3);
        System.out.println(bst.remove(3));
    }
    public static void case6(){
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);

        boolean remove = bst.remove(3);
        System.out.println(remove);
    }
    public static void case11(){
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);
        bst.insert(4);
        boolean remove = bst.remove(3);
        System.out.println(bst.remove(3));
    }
    public static void case12(){
        BST bst = new BST();
        bst.insert(7);
        bst.insert(8);
        bst.insert(5);
        bst.insert(6);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        boolean remove = bst.remove(7);
        System.out.println(remove);
    }
    private static void case14(){
        BST bst = new BST();
        boolean remove = bst.remove(7);
        System.out.println(remove);
    }
    public static void main(String[] args) {
        case14();
    }
}
