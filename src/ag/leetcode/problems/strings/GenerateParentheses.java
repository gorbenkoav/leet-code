package ag.leetcode.problems.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/description/
 */
public class GenerateParentheses {

    private static final String LEFT = "(";
    private static final String RIGHT = ")";

    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        search(n, 1, 0, result, new StringBuilder(LEFT));
        return result;
    }

    private void search(int n, int leftCount, int rightCount, List<String> result, StringBuilder current) {
        if (leftCount < n) {
            search(n, leftCount + 1, rightCount, result, current.append(LEFT));
        }

        if (rightCount < leftCount) {
            search(n, leftCount, rightCount + 1, result, current.append(RIGHT));
        }

        if (current.length() == 2 * n) {
            result.add(current.toString());
        }

        current.deleteCharAt(current.length() - 1);
    }
}
