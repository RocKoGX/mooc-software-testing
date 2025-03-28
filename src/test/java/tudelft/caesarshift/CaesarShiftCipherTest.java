package tudelft.caesarshift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
    CaesarShiftCipher cipher = new CaesarShiftCipher();

    @Test
    public void testPositiveShift() {
        assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
    }

    @Test
    public void testNegativeShift() {
        assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
    }

    @Test
    public void testWrapAroundZ() {
        assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
    }

    @Test
    public void testWrapAroundA() {
        assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
    }

    @Test
    public void testWithSpaces() {
        assertEquals("def ghi", cipher.CaesarShiftCipher("abc def", 3));
    }

    @Test
    public void testInvalidCharacterUpperCase() {
        assertEquals("invalid", cipher.CaesarShiftCipher("Abc", 3));
    }

    @Test
    public void testInvalidCharacterSymbol() {
        assertEquals("invalid", cipher.CaesarShiftCipher("ab#", 2));
    }

    @Test
    public void testZeroShift() {
        assertEquals("abc def", cipher.CaesarShiftCipher("abc def", 0));
    }

    @Test
    public void testLargeShift() {
        assertEquals("bcd", cipher.CaesarShiftCipher("abc", 27)); // shift 1
    }

    @Test
    public void testNegativeLargeShift() {
        assertEquals("zab", cipher.CaesarShiftCipher("abc", -1));
    }

}
