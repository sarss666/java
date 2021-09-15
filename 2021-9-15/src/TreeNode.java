public class TreeNode {

    String key;
    Integer value;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public TreeNode(String key) {
        this.key = key;
    }

    public TreeNode(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
