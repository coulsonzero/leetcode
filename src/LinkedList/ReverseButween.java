package LinkedList;

class ReverseButween {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int i, int i1, int i2) {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseButween(ListNode head, int l, int r){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        r -= l;
        ListNode hh = dummy;
        while(l-- > 1) hh = hh.next;
        ListNode pre = hh.next;
        ListNode cur = pre.next;
        while(r-- > 0) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        hh.next.next = cur;
        hh.next = pre;
        return dummy.next;
    }
}
