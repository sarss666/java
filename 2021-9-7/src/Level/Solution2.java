package Level;

import java.util.Arrays;

class Solution2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = traverse(preorder, inorder);

        return root;
    }

    public TreeNode traverse(int[] preorder, int[] inorder) {
        // 空节点，叶子节点的子节点
        if (preorder.length == 0) {
            return null;
        }

        // 在前序遍历数组中找到根节点的值，并创建根节点
        // 前序遍历：根左右
        int rootVal = preorder[0];
        TreeNode root = new TreeNode((char) rootVal);
        if (preorder.length == 1) {  // 叶子节点，直接返回
            return root;
        }

        // 在中序遍历数组中找出根节点的index
        int splitIdx = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                splitIdx = i;
                break;
            }
        }

        // 对中序遍历数组和前序遍历数组进行划分
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, splitIdx);
        int[] inorderRight = Arrays.copyOfRange(inorder, splitIdx + 1, inorder.length);
        // 前序遍历第一个元素是根节点，需要去掉
        int[] preorderLeft = Arrays.copyOfRange(preorder, 1, 1 + inorderLeft.length);
        int[] preorderRight = Arrays.copyOfRange(preorder, 1 + inorderLeft.length, preorder.length);

        // 递归获取根节点的左右子节点
        root.left = traverse(preorderLeft, inorderLeft);
        root.right = traverse(preorderRight, inorderRight);

        return root;
    }
}

