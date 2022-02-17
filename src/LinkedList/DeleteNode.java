package LinkedList;

/**
 * 删除链表中的节点
 *
 * 输入：head = [4,5,1,9], node = 5
 * 输出：[4,1,9]
 */

class DeleteNode {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;   //把要删除结点的下一个结点的值赋给要删除的结点
        node.next = node.next.next; //然后删除下一个结点
    }

    public static void main(String[] args) {

    }
}
