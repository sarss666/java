package impl;

public class TreeTraversal {


    public static void preTraversal(TreeNode root){
        if(root  != null) {

            System.out.printf("%c", root.v);
            System.out.print(" {");
            preTraversal(root.left);
            System.out.print("} {");
            preTraversal(root.right);
            System.out.print("} ");
        }else {


        }
    }

    public static void inTraversal(TreeNode root){
        if(root  != null) {
            inTraversal(root.left);
            System.out.printf("%c", root.v);
            inTraversal(root.right);
        }else {

        }

    }


    public static void postTraversal(TreeNode root){
        if(root  != null) {
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.printf("%c", root.v);
        }else {

        }
    }


    public static void main(String[] args) {
        TreeNode a = BuildTree.buildTree1();


        preTraversal(a);
        System.out.println();

        inTraversal(a);
        System.out.println();

        postTraversal(a);
        System.out.println();

    }
}
