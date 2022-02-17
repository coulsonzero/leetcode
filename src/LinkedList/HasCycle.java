package LinkedList;

/**
 * 环形链表
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环
 * 如果链表中存在环，则返回 true 。 否则，返回 false
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 *
 * 输入：head = [1], pos = -1
 * 输出：false
 */


class HasCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;                           //快慢两个指针
        while (fast != null && fast.next != null) {
            slow = slow.next;                           //慢指针每次走一步
            fast = fast.next.next;                      //快指针每次走两步
            if (slow == fast)                           //如果相遇，说明有环，直接返回true
                return true;
        }
        return false;                                  //否则就是没环
    }
}
