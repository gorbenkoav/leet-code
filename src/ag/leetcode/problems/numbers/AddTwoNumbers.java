package ag.leetcode.problems.numbers;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = 0;
        int nextVal = 0;
        ListNode resNode = null;
        ListNode prevNode = null;
        ListNode currNode = null;

        do {
            val = (l1 == null ? 0 : l1.val) +
                  (l2 == null ? 0 : l2.val) +
                  nextVal;
            nextVal = val > 9 ? 1 : 0;
            currNode = new ListNode(val % 10);
            if (prevNode == null) {
                resNode = currNode;
            } else {
                prevNode.next = currNode;
            }

            prevNode = currNode;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        } while (l1 != null || l2 != null);

        if (nextVal == 1) {
            prevNode.next = new ListNode(1);
        }
        return resNode;
    }

    public static class ListNode {
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
