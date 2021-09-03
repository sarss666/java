package tree;

import tree.TreeNode;
import tree.BuildTree;

public class Solution1 {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        return p.v == q.v && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }

    public static void main(String[] args) {

    }
    }
