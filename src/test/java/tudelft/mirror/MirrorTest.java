package tudelft.mirror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {

    @Test
    public void testFullMirror() {
        Mirror m = new Mirror();
        String result = m.mirrorEnds("aba");
        assertEquals("aba", result);
    }

    @Test
    public void testPartialMirror() {
        Mirror m = new Mirror();
        String result = m.mirrorEnds("abXYZba");
        assertEquals("ab", result);
    }

    @Test
    public void testSingleCharacter() {
        Mirror m = new Mirror();
        String result = m.mirrorEnds("x");
        assertEquals("x", result);
    }

    @Test
    public void testNoMirror() {
        Mirror m = new Mirror();
        String result = m.mirrorEnds("xyz");
        assertEquals("", result);
    }

    @Test
    public void testEmptyString() {
        Mirror m = new Mirror();
        String result = m.mirrorEnds("");
        assertEquals("", result);
    }
}
