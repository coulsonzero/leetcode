package LinkedList;

import java.util.HashSet;
import java.util.Set;

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

        ListNode(int x) {
            val = x;
        }
    }

    // 快慢指针
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            // 慢指针每次走一步, 快指针每次走两步
            slow = slow.next;
            fast = fast.next.next;
            // 如果相遇，说明有环，直接返回true
            if (slow == fast)
                return true;
        }
        return false; //否则就是没环
    }

    // 集合判断
    public boolean hasCycle2(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            // 如果重复出现说明有环
            if (set.contains(head))
                return true;
            // 否则就把当前节点加入到集合中
            set.add(head);
            head = head.next;
        }
        return false;
    }

    // 递归逐个删除
    public boolean hasCycle3(ListNode head) {
        if (head == null || head.next == null) return false;
        // 如果出现head.next = head表示有环
        if (head.next == head) return true;
        ListNode node = head.next;
        // 当前节点的next指向他自己，相当于把它删除了
        head.next = head;
        return hasCycle(node);
    }
}
