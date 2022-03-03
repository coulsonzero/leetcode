'''
环形链表2
'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head: return None
        dict = {}
        while head:
            if head in dict: return dict[head]
            dict[head] = head
            head = head.next
        return None