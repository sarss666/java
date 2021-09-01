package impl;

public class TreeTraversal {


    public static void preTraversal(TreeNode root){
        if(root  != null) {

            System.out.printf("%c", root.v);

            preTraversal(root.left);

            preTraversal(root.right);
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
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        TreeNode i = new TreeNode('I');
        TreeNode j = new TreeNode('J');

        //节点之间的关系
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = null;

        c.left = e;
        c.right = f;

        d.left = null;
        d.right = g;

        e.left = null;
        e.right = null;

        f.left = h;
        f.right = i;

        g.left = j;
        g.right = null;

        h.left = null;
        h.right = null;

        i.left = null;
        i.left = null;

        j.left = null;
        j.left = null;


        preTraversal(a);
        System.out.println();

        inTraversal(a);
        System.out.println();

        postTraversal(a);
        System.out.println();

    }
}
