package ag.leetcode.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 1;
        Map<Character, Integer> distinctSymbols = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            if (distinctSymbols.containsKey(s.charAt(j))) {
                maxLength = Math.max(maxLength, distinctSymbols.size());
                int repeatedSymbolIndex = distinctSymbols.get(s.charAt(j));
                distinctSymbols.entrySet().removeIf(entry -> entry.getValue() <= repeatedSymbolIndex);
            }
            distinctSymbols.put(s.charAt(j), j);
        }

        return Math.max(maxLength, distinctSymbols.size());
    }
}
