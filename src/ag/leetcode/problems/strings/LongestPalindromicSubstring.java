package ag.leetcode.problems.strings;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int length = s.length();
        Palindrome largestPalindrome = new Palindrome(0, 0);
        for (int i = 0; i < length; i++) {
            largestPalindrome(s, length, new Palindrome(i, i), largestPalindrome);
            largestPalindrome(s, length, new Palindrome(i + 1, i), largestPalindrome);
        }
        return s.substring(largestPalindrome.start, largestPalindrome.finish);
    }

    private void largestPalindrome(String source, int length, Palindrome palindrome, Palindrome largestPalindrome) {
        while (palindrome.isRangeValid(length)
                && source.charAt(palindrome.start - 1) == source.charAt(palindrome.finish + 1)) {
            palindrome.start--;
            palindrome.finish++;
        }

        if (palindrome.compareTo(largestPalindrome) >= 0) {
            largestPalindrome.start = palindrome.start;
            largestPalindrome.finish = palindrome.finish + 1;
        }
    }

    public static class Palindrome implements Comparable<Palindrome> {
        private int start;
        private int finish;

        public Palindrome(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        public int length() {
            return finish - start;
        }

        public boolean isRangeValid(int length) {
            return start - 1 >= 0 && finish + 1 < length;
        }

        @Override
        public int compareTo(Palindrome other) {
            if (this.length() == other.length()) {
                return 0;
            }
            return this.length() < other.length() ? -1 : 1;
        }
    }
}
