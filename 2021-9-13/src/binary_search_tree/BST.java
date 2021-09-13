package binary_search_tree;

public class BST {
    private Node root;

    public BST(){
        root = null;
    }

    public boolean search(Integer key){
        Node current = root;

        while (current != null){
            int cmp = key.compareTo(current.key);
            if (cmp == 0){
                return true;
            }else if (cmp < 0){
                current = current.left;
            }else {
                current = current.right;
            }
        }
        return false;
    }
    public void insert(Integer key){
        if (root == null){
            root = new Node(key);
            return;
        }
        Node parent = null;
        Node current = root;
        int cmp = 0;
        while (current != null){
             cmp = key.compareTo(current.key);
            if (cmp ==0){
                throw new RuntimeException("BST中不允许出现相同的key");
            }else if (cmp < 0){
                parent = current;
                current = current.left;
            }else {
                parent = current;
                current = current.right;
            }
        }
        Node node = new Node(key);
        if (cmp < 0){
            parent.left = node;
        }else {
            parent.right = node;
        }
    }
}
