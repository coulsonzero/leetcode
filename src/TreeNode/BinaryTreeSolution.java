package TreeNode;

/**
 *  [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */

public class BinaryTreeSolution {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(15, null, null);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode node1 = new TreeNode(3, node2, node3);


        BinaryTree tree = new BinaryTree();
        System.out.println(tree.preorderTraversal(node1));      // [3, 9, 20, 15, 7]
        System.out.println(tree.inorderTraversal(node1));       // [9, 3, 15, 20, 7]
        System.out.println(tree.postorderTraversal(node1));     // [9, 15, 7, 20, 3]
        System.out.println(tree.levelOrderTraversal(node1));    // [[3], [9, 20], [15, 7]]
    }
}
