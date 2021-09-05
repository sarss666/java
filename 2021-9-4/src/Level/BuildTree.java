package Level;

import sun.reflect.generics.tree.Tree;

public class BuildTree {
    public static TreeNode buildTree1(){


        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        TreeNode I = new TreeNode('I');
        A.left = B;
        A.right = C;
        B.left = D;
        C.left = E;
        C.right = F;
        D.left = G;
        D.right = H;
        E.right = I;
        return A;


//        Level.TreeNode a = new Level.TreeNode('A');
//        Level.TreeNode b = new Level.TreeNode('B');
//        Level.TreeNode c = new Level.TreeNode('C');
//        Level.TreeNode d = new Level.TreeNode('D');
//        Level.TreeNode e = new Level.TreeNode('E');
//        Level.TreeNode f = new Level.TreeNode('F');
//        Level.TreeNode g = new Level.TreeNode('G');
//        Level.TreeNode h = new Level.TreeNode('H');
//        Level.TreeNode i = new Level.TreeNode('I');
//        Level.TreeNode j = new Level.TreeNode('J');
//
//        //节点之间的关系
//        a.left = b;
//        a.right = c;
//
//        b.left = d;
//        b.right = null;
//
//        c.left = e;
//        c.right = f;
//
//        d.left = null;
//        d.right = g;
//
//        e.left = null;
//        e.right = null;
//
//        f.left = h;
//        f.right = i;
//
//        g.left = j;
//        g.right = null;
//
//        h.left = null;
//        h.right = null;
//
//        i.left = null;
//        i.left = null;
//
//        j.left = null;
//        j.left = null;
//
//        return a;
    }
}
