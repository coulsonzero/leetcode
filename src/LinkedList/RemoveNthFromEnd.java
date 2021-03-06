package LinkedList;

/**
 * 删除链表的倒数第 n 个结点
 *
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 */


class RemoveNthFromEnd {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
