package ag.leetcode.problems.strings;

/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows < 1) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }

        int wave = (2 * numRows - 2);
        int count = (s.length() + wave / 2) / wave + 1;
        StringBuilder zigzag = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < count; j++) {
                if (i > 0 && i < numRows - 1) {
                    appendSymbolIfInRange(zigzag, s, wave * j - i);
                }
                appendSymbolIfInRange(zigzag, s, wave * j + i);
            }
        }

        return zigzag.toString();
    }

    private void appendSymbolIfInRange(StringBuilder zigzag, String s, int index) {
        if (index >= 0 && index < s.length()) {
            zigzag.append(s.charAt(index));
        }
    }
}
