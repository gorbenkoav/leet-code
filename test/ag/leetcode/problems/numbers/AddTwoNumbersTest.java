package ag.leetcode.problems.numbers;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @org.junit.jupiter.api.Test
    void addTwoNumbers() {
        AddTwoNumbers.ListNode firstNode = new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(4, new AddTwoNumbers.ListNode(3, null)));
        AddTwoNumbers.ListNode secondNode = new AddTwoNumbers.ListNode(5, new AddTwoNumbers.ListNode(6, new AddTwoNumbers.ListNode(4, null)));
        AddTwoNumbers.ListNode sumNode = new AddTwoNumbers().addTwoNumbers(firstNode, secondNode);
        assertEquals(sumNode.val, 7);
        assertEquals(sumNode.next.val, 0);
        assertEquals(sumNode.next.next.val, 8);
        assertEquals(sumNode.next.next.next, null);
    }

    @org.junit.jupiter.api.Test
    void addTwoNumbersTransferOverOne() {
        AddTwoNumbers.ListNode firstNode = new AddTwoNumbers.ListNode(3, null);
        AddTwoNumbers.ListNode secondNode = new AddTwoNumbers.ListNode(9,  null);
        AddTwoNumbers.ListNode sumNode = new AddTwoNumbers().addTwoNumbers(firstNode, secondNode);
        assertEquals(sumNode.val, 2);
        assertEquals(sumNode.next.val, 1);
        assertEquals(sumNode.next.next, null);
    }

    @org.junit.jupiter.api.Test
    void addTwoNumbersDiffSize() {
        AddTwoNumbers.ListNode firstNode = new AddTwoNumbers.ListNode(3, new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(5, null)));
        AddTwoNumbers.ListNode secondNode = new AddTwoNumbers.ListNode(1,  null);
        AddTwoNumbers.ListNode sumNode = new AddTwoNumbers().addTwoNumbers(firstNode, secondNode);
        assertEquals(sumNode.val, 4);
        assertEquals(sumNode.next.val, 2);
        assertEquals(sumNode.next.next.val, 5);
        assertEquals(sumNode.next.next.next, null);
    }
}