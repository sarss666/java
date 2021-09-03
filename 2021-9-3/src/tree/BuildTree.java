package tree;

import sun.reflect.generics.tree.Tree;

public class BuildTree {

    public static TreeNode buildTree1() {
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

        return a;
    }

    public static TreeNode buildTree2(){


        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');

        //节点之间的关系
        a.left = b;
        a.right = c;
        b.left = d;

        return a;

    }
    public static TreeNode buildTree3(){


        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(2);

        //节点之间的关系
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        return a;

    }
    public static TreeNode buildTree4(){



        TreeNode b= new TreeNode(4);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(2);

        //节点之间的关系
        b.left = d ;
        b.right = e;


        return b;

    }

}
