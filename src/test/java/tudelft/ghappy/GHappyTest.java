package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {
    @Test
    public void testAllGsAreHappy() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy("xxggxx"));      // g está en pareja
    }

    @Test
    public void testSingleGIsUnhappy() {
        GHappy g = new GHappy();
        assertFalse(g.gHappy("xxgxx"));      // g solita
    }

    @Test
    public void testLastGIsUnhappy() {
        GHappy g = new GHappy();
        assertFalse(g.gHappy("xxggyygxx"));  // última g solita
    }

    @Test
    public void testNoGs() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy("abcdef"));      // No hay g
    }

    @Test
    public void testGsAtEdges() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy("ggxxgg"));      // g feliz al inicio y fin
        assertFalse(g.gHappy("gxxgg"));      // g solitaria al inicio
        assertFalse(g.gHappy("ggxxg"));      // g solitaria al final
    }

    @Test
    public void testMultiplePairs() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy("gggg"));        // todas están en grupo
    }

    @Test
    public void testAlternatingGs() {
        GHappy g = new GHappy();
        assertFalse(g.gHappy("gagbgcgdg"));  // todas solitarias
    }

    @Test
    public void testNullOrEmptyString() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy(""));            // vacío = true
    }
}
