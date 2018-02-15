package ag.leetcode.problems.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    @Test
    void mergeKLists() {
        MergeKSortedLists.ListNode[] nodes = {
                new MergeKSortedLists.ListNode(1, new MergeKSortedLists.ListNode(4, new MergeKSortedLists.ListNode(7, null))),
                new MergeKSortedLists.ListNode(2, new MergeKSortedLists.ListNode(6, new MergeKSortedLists.ListNode(8, null))),
                new MergeKSortedLists.ListNode(3, new MergeKSortedLists.ListNode(5, null))};

        MergeKSortedLists merger = new MergeKSortedLists();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, toValueArray(merger.mergeKLists(nodes)));
    }

    private int[] toValueArray(MergeKSortedLists.ListNode node) {
        List<Integer> values = new ArrayList<>();
        while (node != null) {
            values.add(node.val);
            node = node.next;
        }
        return values.stream().mapToInt(i -> i).toArray();
    }
}