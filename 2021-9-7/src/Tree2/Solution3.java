package Tree2;



public class Solution3 {
    private void preOrder(StringBuilder sb, TreeNode node){
        if (node != null) {
            sb.append(node.val);
            if (node.left == null && node.right == null) {
                return;
            } else if (node.left != null && node.right == null) {
                sb.append("(");
                preOrder(sb, node.left);
                sb.append(")");
            } else {

                sb.append("(");
                preOrder(sb, node.left);
                sb.append(")");
                sb.append("(");
                preOrder(sb, node.right);
                sb.append(")");
            }
        }

    }
    public String tree2str(TreeNode t){


        StringBuilder sb = new StringBuilder();
        preOrder(sb,t);
        return sb.toString();
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.tree2str(null));
    }
}
