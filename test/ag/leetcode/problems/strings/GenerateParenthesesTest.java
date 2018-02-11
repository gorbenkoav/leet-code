package ag.leetcode.problems.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        GenerateParentheses parentheses = new GenerateParentheses();

        assertLinesMatch(Collections.emptyList(), parentheses.generateParenthesis(0));
        assertLinesMatch(Collections.singletonList("()"), parentheses.generateParenthesis(1));
        assertLinesMatch(Arrays.asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"), parentheses.generateParenthesis(3));
    }
}