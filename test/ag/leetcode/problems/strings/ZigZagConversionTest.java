package ag.leetcode.problems.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {

    @Test
    void convert() {
        ZigZagConversion zigzag = new ZigZagConversion();

        assertEquals("a", zigzag.convert("a", 1));
        assertEquals("", zigzag.convert("", 3));
        assertEquals("a", zigzag.convert("a", 3));
        assertEquals("PAHAPLSIIYIR", zigzag.convert("PAYPALISHIRI", 3));
        assertEquals("PAHNAPLSIIGYIR", zigzag.convert("PAYPALISHIRING", 3));
    }
}