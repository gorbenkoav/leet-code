package ag.leetcode.problems.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void longestPalindrome() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        assertEquals("bb", lps.longestPalindrome("cbbd"));
        assertEquals("bab", lps.longestPalindrome("babad"));
        assertEquals("dfghgfd", lps.longestPalindrome("gvcccdrdfghgfdqwedd"));
        assertEquals("", lps.longestPalindrome(""));
        assertEquals("a", lps.longestPalindrome("a"));
    }
}