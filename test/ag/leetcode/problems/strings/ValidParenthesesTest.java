package ag.leetcode.problems.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses parentheses = new ValidParentheses();

        assertTrue(parentheses.isValid("()"));
        assertTrue(parentheses.isValid("()[]{}"));

        assertFalse(parentheses.isValid("(]"));
        assertFalse(parentheses.isValid("([)]"));

    }
}