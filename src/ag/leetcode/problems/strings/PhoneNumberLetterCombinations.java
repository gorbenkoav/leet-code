package ag.leetcode.problems.strings;

import java.util.*;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */
public class PhoneNumberLetterCombinations {

    private static Map<Character, Character[]> buttons = new HashMap<>();

    static {
        buttons.put('2', new Character[]{'a', 'b', 'c'});
        buttons.put('3', new Character[]{'d', 'e', 'f'});
        buttons.put('4', new Character[]{'g', 'h', 'i'});
        buttons.put('5', new Character[]{'j', 'k', 'l'});
        buttons.put('6', new Character[]{'m', 'n', 'o'});
        buttons.put('7', new Character[]{'p', 'q', 'r', 's'});
        buttons.put('8', new Character[]{'t', 'u', 'v'});
        buttons.put('9', new Character[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        search(digits, 0, result, new StringBuilder());
        return result;
    }

    private void search(String digits, int index, List<String> result, StringBuilder current) {
        if (index < digits.length()) {
            for (Character next : buttons.get(digits.charAt(index))) {
                current.append(next);
                search(digits, index + 1, result, current);
                current.deleteCharAt(current.length() - 1);
            }
        } else {
            result.add(current.toString());
        }
    }
}
