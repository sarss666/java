package impl;

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
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;


//        TreeNode a = new TreeNode('A');
//        TreeNode b = new TreeNode('B');
//        TreeNode c = new TreeNode('C');
//        TreeNode d = new TreeNode('D');
//        TreeNode e = new TreeNode('E');
//        TreeNode f = new TreeNode('F');
//        TreeNode g = new TreeNode('G');
//        TreeNode h = new TreeNode('H');
//        TreeNode i = new TreeNode('I');
//        TreeNode j = new TreeNode('J');
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
