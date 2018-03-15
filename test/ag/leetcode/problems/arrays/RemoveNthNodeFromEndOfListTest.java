package ag.leetcode.problems.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList.ListNode node;

    @BeforeEach
    void createNode() {
        node = new RemoveNthNodeFromEndOfList.ListNode(2,
               new RemoveNthNodeFromEndOfList.ListNode(4,
               new RemoveNthNodeFromEndOfList.ListNode(3, null)));
    }

    @Test
    void removeFirst() {
        RemoveNthNodeFromEndOfList remover = new RemoveNthNodeFromEndOfList();
        assertEquals(4, remover.removeNthFromEnd(node, 3).val);
    }

    @Test
    void removeLast() {
        RemoveNthNodeFromEndOfList remover = new RemoveNthNodeFromEndOfList();
        assertEquals(4, remover.removeNthFromEnd(node, 1).next.val);
    }

    @Test
    void removeMiddle() {
        RemoveNthNodeFromEndOfList remover = new RemoveNthNodeFromEndOfList();
        assertEquals(3, remover.removeNthFromEnd(node, 2).next.val);
    }

}