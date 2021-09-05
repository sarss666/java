package Level;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder {

    public static void levelOrderTraversal(TreeNode root) {

        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            System.out.println(node.val);

            if (node.left != null) {

                queue.add(node.left);
            }
            if (node.right != null) {

                queue.add(node.right);
            }
        }
    }

    public static boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (true){
            TreeNode node = queue.remove();
            if (node == null){
                break;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null){

            }else {
                return false;
            }

        }
        return true;
    }

    static class NL{

        TreeNode node;
        int level;

        public NL(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public static void levelOrderWithLevel(TreeNode root){
        if (root == null){
            return;
        }
        Queue<NL> queue = new LinkedList<>();
        queue.add(new NL(root,1));

        while (!queue.isEmpty()) {
            NL nl = queue.remove();
            TreeNode node = nl.node;
            int level = nl.level;

                System.out.println(level);
                System.out.println(node.val);
                if (node.left != null){
                    queue.add(new NL(node.left,level+1));
                }
                if (node.right != null){
                    queue.add(new NL(node.right,level+1));

            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
        System.out.println("=============");

        levelOrderWithLevel(root);
    }
}
