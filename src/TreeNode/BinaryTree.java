package TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 前序遍历：根左右
 * 中序遍历：左根右
 * 后序遍历：左右根
 * 层序遍历：从上到下，从左往右
 *
 */

public class BinaryTree {
    private final List<Integer> list = new ArrayList<>();
    private final List<List<Integer>> leaveList = new ArrayList<>();

    /*********************
     *      前序遍历      *
     *********************/
    private void preOrder(TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 中序遍历
     */
    public void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    /**
     * 后序遍历
     */
    public void postOrder(TreeNode root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);
    }
    /**
     * 层序遍历
     */
    public void dns(TreeNode node, int lever){
        if(node == null) return;
        if(leaveList.size() == lever) leaveList.add(new ArrayList<Integer>());
        leaveList.get(lever).add(node.val);
        dns(node.left, lever+1);
        dns(node.right, lever+1);
    }



    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return list;
    }

    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        dns(root, 0);
        return leaveList;
    }
}
