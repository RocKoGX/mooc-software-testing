package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    public void testSameSizeNoCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(3, 4))
        );
        assertEquals(Arrays.asList(4, 6), result);
    }

    @Test
    public void testDifferentSizeWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9)),
                new ArrayList<>(Arrays.asList(1))
        );
        assertEquals(Arrays.asList(1, 0, 0), result);
    }

    @Test
    public void testAllCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(5, 5)),
                new ArrayList<>(Arrays.asList(5, 5))
        );
        assertEquals(Arrays.asList(1, 1, 0), result);
    }

    @Test
    public void testSingleDigit() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(2)),
                new ArrayList<>(Arrays.asList(3))
        );
        assertEquals(Arrays.asList(5), result);
    }

    @Test
    public void testEmptyList() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(1, 2))
        );
        assertEquals(Arrays.asList(1, 2), result);
    }
}
