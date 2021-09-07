package Level;

public class TreeNode {

    char val;
TreeNode left;
TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }


    @Override
    public String toString() {
        return String.format("%c", val);
    }
}

