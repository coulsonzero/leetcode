package TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树
 *
 * [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */

public class Preorder {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(15, null, null);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode node1 = new TreeNode(3, node2, node3);

        // preorder(node1);
         System.out.println(preorderTraversal(node1));
    }

    /**
     * 前序遍历：根左右
     * 中序遍历：左根右
     * 后序遍历：左右根
     * 层序遍历：从上到下，从左往右
     *
     */

    // 递归：前序遍历
    public static void preorder(TreeNode root) {
        if(root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);

    }

    // 迭代：前序遍历
    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
        return list;
    }


}
