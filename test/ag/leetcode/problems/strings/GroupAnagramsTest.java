package ag.leetcode.problems.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        GroupAnagrams anagrams = new GroupAnagrams();

        assertEquals(0, anagrams.groupAnagrams(new String[]{}).size());
        assertEquals(1, anagrams.groupAnagrams(new String[]{""}).size());
        assertEquals(1, anagrams.groupAnagrams(new String[]{"", ""}).size());
        assertEquals(3, anagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size());
    }
}