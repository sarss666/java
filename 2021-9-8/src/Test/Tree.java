package Test;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Tree {
    public static int getDeep(TreeNode root) {
        if(root == null){
            return 0;
        }else {
            int left = getDeep(root.left);
            int right = getDeep(root.right);
            return Math.max(left,right)+1;
        }

    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        System.out.println();


    }

}
