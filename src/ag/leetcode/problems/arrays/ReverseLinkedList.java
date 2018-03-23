package ag.leetcode.problems.arrays;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 * Reverse a singly linked list.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode temp = null;

        while (head != null) {
            temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }

        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
