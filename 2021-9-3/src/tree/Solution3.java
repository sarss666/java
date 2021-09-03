package tree;

public class Solution3 {

    public boolean isSameTree(TreeNode s,TreeNode t){
        // 同时为空 说明树一起到底，两树相同
        if (s==null && t == null){
            return true;
        }
        // 如果上面没有返回值，说明必有一个没有为空（有可能两个都不为空）
        if (s == null || t == null){
            return false;
        }
        // 如果判断到了这一步，说明两个都不为空
        // 先序遍历 自己--左 -- 右
        if (s.v != t.v){
            return false;
        }
        return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // 我s都遍历完了。你居然还没匹配上。那就返回false
        if (s==null){
            return false;
        }
        // 短路运算符，有一个为真，返回真
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public static void main(String[] args) {
        TreeNode p = BuildTree.buildTree3();
        TreeNode q = BuildTree.buildTree4();

        Solution3 solution3 = new Solution3();
        System.out.println(solution3.isSameTree(p, q));


    }
}
