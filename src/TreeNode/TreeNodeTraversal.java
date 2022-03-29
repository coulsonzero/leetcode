package TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树
 *
 * 前序遍历：根左右
 * 中序遍历：左根右
 * 后序遍历：左右根
 * 层序遍历：从上到下，从左往右
 *
 * [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */


/**
 * 前序遍历：根左右
 * 中序遍历：左根右
 * 后序遍历：左右根
 * 层序遍历：从上到下，从左往右
 *
 */

public class TreeNodeTraversal {
    public static void main(String[] args) {
        /*
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
         */
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(15, null, null);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode node1 = new TreeNode(3, node2, node3);

        // 二叉树的遍历
        Solution solution = new Solution();
        // 前序遍历
        System.out.println(solution.preorderTraversal(node1));      // [3, 9, 20, 15, 7]
        // 中序遍历
        System.out.println(solution.inorderTraversal(node1));       // [9, 3, 15, 20, 7]
        // 后序遍历
        System.out.println(solution.postorderTraversal(node1));     // [9, 15, 7, 20, 3]
        // 层序遍历
        System.out.println(solution.levelOrderTraversal(node1));    // [[3], [9, 20], [15, 7]]
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private List<Integer> list;
    private List<List<Integer>> leaveList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        preOrder(root);
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inOrder(root);
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        postOrder(root);
        return list;
    }

    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        dns(root, 0);
        return leaveList;
    }

    /**
     * 前序遍历
     */
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
}