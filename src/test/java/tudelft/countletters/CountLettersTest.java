package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void endsWithRBeforeSeparator() {
        int result = new CountLetters().count("perr|gatito");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void endsWithOtherLetterBeforeSeparator() {
        int result = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, result);
    }
    @Test
    public void wordEndsWithR_NoSeparator_ShouldBeCounted() {
        int result = new CountLetters().count("perr");
        Assertions.assertEquals(1, result);
    }
}