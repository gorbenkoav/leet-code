package ag.leetcode.problems.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode fakeFirst = new ListNode(0);
        merge(fakeFirst, Arrays.copyOf(lists, lists.length));
        return fakeFirst.next;
    }

    private void merge(ListNode last, ListNode[] lists) {
        int nextIndex = 0;
        ListNode next = null;
        for (int i = 0; i < lists.length; i++) {
            if (next == null || (lists[i] != null && next.val > lists[i].val)) {
                next = lists[i];
                nextIndex = i;
            }
        }

        if (next != null) {
            last.next = new ListNode(next.val);
            lists[nextIndex] = next.next;
            merge(last.next = next,lists);
        }
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
