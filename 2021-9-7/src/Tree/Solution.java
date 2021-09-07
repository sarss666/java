package Tree;

import Tree.TreeNode;

import java.util.ArrayList;
public class Solution {
    private ArrayList<TreeNode> list = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        mid(pRootOfTree);
        if(list.size()==1 || list.size()==0){
            return pRootOfTree;
        }
        TreeNode root = null;
        TreeNode pre = null;
        TreeNode after = null;
        for(int i=0;i<list.size()-1;i++){
            if(i==0){
                root=list.get(i);
                root.left = pre;
                pre = root;
                after= list.get(i+1);
                root.right=after;
            }else{
                after.left=pre;
                pre = after;
                after = list.get(i+1);
                pre.right = after;
            }
        }
        after.left = pre;
        after.right = null;
        return root;
    }
    private void mid(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return ;
        }
        if(pRootOfTree.left!=null){
            mid(pRootOfTree.left);
        }
        list.add(pRootOfTree);
        if(pRootOfTree.right!=null){
            mid(pRootOfTree.right);
        }
    }
}
