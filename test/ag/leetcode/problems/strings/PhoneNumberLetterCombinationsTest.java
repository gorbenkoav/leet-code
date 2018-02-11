package ag.leetcode.problems.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberLetterCombinationsTest {

    @Test
    void letterCombinations() {
        PhoneNumberLetterCombinations combinations = new PhoneNumberLetterCombinations();

        assertLinesMatch(Collections.emptyList(),
                combinations.letterCombinations(""));

        assertLinesMatch(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
                combinations.letterCombinations("23"));
    }
}