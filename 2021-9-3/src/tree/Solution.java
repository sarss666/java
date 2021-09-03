package tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void preorderPrint(TreeNode root){
        if(root  != null) {
            System.out.println(root);
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new  ArrayList<>();
        if (root != null){
            list.add(root.v);
            List<Integer> leftSubTreeList = preorderTraversal(root.left);
            list.addAll(leftSubTreeList);
            List<Integer> rightSubTreeList = preorderTraversal(root.right);
            list.addAll(rightSubTreeList);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode  root = BuildTree.buildTree1();

        Solution solution = new Solution();
        System.out.println(solution.preorderTraversal(root));
    }


}
