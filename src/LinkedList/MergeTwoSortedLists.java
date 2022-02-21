package LinkedList;

/**
 * 21. 合并两个有序链表
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */

class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode mergeTwoLists(ListNode linked1, ListNode linked2) {
        // 只要有一个为null，就返回另一个
        if (linked1 == null || linked2 == null)
            return linked2 == null ? linked1 : linked2;
        // 当前最小节点
        ListNode first = (linked2.val < linked1.val) ? linked2 : linked1;
        // 下一个节点
        first.next = mergeTwoLists(first.next, first == linked1 ? linked2 : linked1);
        return first;
    }

    public static void main(String[] args) {
        /*
        ListNode node1 = new ListNode(1, 2, 4);
        ListNode node2 = new ListNode(1, 3, 4);
        mergeTwoLists(node1, node2);
        */
    }
}







