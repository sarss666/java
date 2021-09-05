import java.util.Scanner;

class TreeNode {//定义节点
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {//提供构造方法
        this.val = val;
    }
}

public class Main{
    public static int i = 0;

    //这个函数的步骤是：先根，再左，再右
    public static TreeNode creatTree(String str) {
        TreeNode root = null;
        if (str.charAt(i) != '#') {//创建的i下标的元素不为#
            root = new TreeNode(str.charAt(i));//new一个不为#的，前进过程中每一个节点都是根
            i++;
            root.left = creatTree(str);
            root.right = creatTree(str);
        }else {//创建的i下标的元素为#
            i++;
        }
        return root;
    }

    public static void inorder(TreeNode root) {//中序遍历
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//注意在上面导入包
        String str = scanner.nextLine();
        TreeNode root = creatTree(str);//定义一个root节点
        inorder(root);//用中序遍历把结果输出
    }
}
