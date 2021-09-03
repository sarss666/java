package tree;

import tree.TreeNode;
import tree.BuildTree;

public class Solution2 {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return cmp(root.left, root.right);
    }

    private boolean cmp(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.v != node2.v) {
            return false;
        }
        return cmp(node1.left, node2.right) && cmp(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = BuildTree.buildTree1();

        System.out.println();
    }
}
