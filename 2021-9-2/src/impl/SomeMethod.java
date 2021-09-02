package impl;

import sun.reflect.generics.tree.Tree;

public class SomeMethod {

    private static int n;
    public static int sumTreeNodeSize1 (TreeNode root){
      //  int n = 0;
        preOrder(root);

        return n;
    }


    public static void  preOrder(TreeNode root){
        if(root != null) {
            n++;
            preOrder(root.left);

            preOrder(root.right);

        }
    }

    public static int sumTreeNodeSize2 (TreeNode root){
        if(root == null) {
            return  0;
        }else {
            int rootNodeSize = 1;
            int leftSubTreeNodeSize = sumTreeNodeSize2(root.left);
            int rightSubTreeNodeSize = sumTreeNodeSize2(root.right);

            return rootNodeSize + leftSubTreeNodeSize + rightSubTreeNodeSize;
        }
    }

    private static int leafN;
    public static int sumTreeLeafNodeSize(TreeNode root){

        leafN = 0;
        preOrder2(root);
        return leafN;
    }

    public static int sumTreeLeafNodeSize2(TreeNode root){
        if (root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else {
            int leftSubTreeLeafSize = sumTreeLeafNodeSize2(root.left);
            int rightSubTreeLeafSize = sumTreeLeafNodeSize2(root.right);
            return leftSubTreeLeafSize + rightSubTreeLeafSize;
        }

    }
    public static void preOrder2(TreeNode root) {
        if (root != null){
            if (root.left == null && root.right == null){
                leafN++;
            }
            preOrder2(root.left);
            preOrder2(root.right);
        }

    }

    public static int sumKLevelNodeSize(TreeNode root,int k){
        if (root == null){
            return 0;
        }else if (k == 1){
            return 1;
        }else {
            int leftSubTreeK_1 = sumKLevelNodeSize(root.left,k-1);
            int rightSubTreeK_1 = sumKLevelNodeSize(root.right,k-1);
            return leftSubTreeK_1 + rightSubTreeK_1;
        }

    }
    public static int getHeightNodeSize(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = getHeightNodeSize(root.left);
        int rightHeight = getHeightNodeSize(root.right);

        return leftHeight>rightHeight ? leftHeight+1 : rightHeight+1;
    }

    public static boolean contains(TreeNode root, int v){
        if (root == null){
            return false;
        }
        if (root.v == v){
            return true;
        }else {
            boolean nodeLeft = contains(root.left, v);
            if (nodeLeft) {
                return true;
            } else {
                boolean nodeRight = contains(root.right, v);
                if (nodeRight) {
                    return true;
                } else {
                    return false;
                }
            }
        }


    }


    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
        System.out.println(contains(root,'A'));
        System.out.println(contains(null,'A'));
        System.out.println(contains(root,'Z'));

//        System.out.println("第1层,结点个数"+sumKLevelNodeSize(root,1));
//        System.out.println("第2层,结点个数"+sumKLevelNodeSize(root,2));
//        System.out.println("第3层,结点个数"+sumKLevelNodeSize(root,3));
//        System.out.println("第4层,结点个数"+sumKLevelNodeSize(root,4));
//        System.out.println("第5层,结点个数"+sumKLevelNodeSize(root,5));
//        System.out.println("第6层,结点个数"+sumKLevelNodeSize(root,6));
//        System.out.println("第7层,结点个数"+sumKLevelNodeSize(root,7));
//        System.out.println("二叉树的高度为"+getHeightNodeSize(root)+"层");

    }
    public static void main1(String[] args) {
        TreeNode root = BuildTree.buildTree1();
        int sum = sumTreeLeafNodeSize2(root);
        System.out.println("树的结点的个数"+sum);

        sum = sumTreeLeafNodeSize2(root);
        System.out.println("树的叶子结点的个数"+sum);

    }
}
