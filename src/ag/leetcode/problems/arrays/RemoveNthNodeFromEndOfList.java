package ag.leetcode.problems.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeDeleted = head;
        ListNode richTheEnd = head;

        for (int i = 0; i < n; i++) {
            richTheEnd = richTheEnd.next;
        }

        if (richTheEnd == null) {
            return head.next;
        } else {
            while (richTheEnd.next != null) {
                beforeDeleted = beforeDeleted.next;
                richTheEnd = richTheEnd.next;
            }

            beforeDeleted.next = beforeDeleted.next.next;
        }

        return head;
    }

    public ListNode removeNthFromEndIndexedArray(ListNode head, int n) {
        List<ListNode> numerated = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            numerated.add(current);
            current = current.next;
        }
        numerated.add(null);

        if (numerated.size() == n + 1) {
            return head.next;
        } else {
            numerated.get(numerated.size() - n - 2).next = numerated.get(numerated.size() - n);
        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
