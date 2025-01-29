package com.ontariotechu.sofe3980U;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest {

    /**
     * Test OR operation with equal length binary numbers
     */
    @Test
    public void testOr() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("1100");
        Binary result = b1.or(b2);
        assertEquals("1110", result.getValue());
    }

    /**
     * Test AND operation with equal length binary numbers
     */
    @Test
    public void testAnd() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("1100");
        Binary result = b1.and(b2);
        assertEquals("1000", result.getValue());
    }

    /**
     * Test Multiply operation
     */
    @Test
    public void testMultiply() {
        Binary b1 = new Binary("101"); // 5 in decimal
        Binary b2 = new Binary("11");  // 3 in decimal
        Binary result = b1.multiply(b2);
        assertEquals("1111", result.getValue()); // 15 in binary
    }

    /**
     * Test OR operation with different length binary numbers
     */
    @Test
    public void testOrWithDifferentLengths() {
        Binary b1 = new Binary("101");
        Binary b2 = new Binary("10011");
        Binary result = b1.or(b2);
        assertEquals("10111", result.getValue());
    }

    /**
     * Test AND operation with a zero binary number
     */
    @Test
    public void testAndWithZero() {
        Binary b1 = new Binary("0");
        Binary b2 = new Binary("10101");
        Binary result = b1.and(b2);
        assertEquals("0", result.getValue());
    }

    /**
     * Test Multiply operation with zero
     */
    @Test
    public void testMultiplyWithZero() {
        Binary b1 = new Binary("0");
        Binary b2 = new Binary("1101");
        Binary result = b1.multiply(b2);
        assertEquals("0", result.getValue());
    }
}
