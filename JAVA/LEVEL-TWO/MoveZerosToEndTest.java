import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MoveZerosToEndTest {

    @Test
    public void testWithGivenExamplePushesZeroToTheBack() {
        int[] input = {5, 0, 3, 0, 2, 0};
        int[] expected = {5, 3, 2, 0, 0, 0};
        assertArrayEquals(expected, MoveZerosToEnd.moveZerosToEnd(input));
    }

    @Test
    public void testWithNoZerosAndMustNotReturnZeros() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, MoveZerosToEnd.moveZerosToEnd(input));
    }

    @Test
    public void testWithAllZerosReturnsAllZeros() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, MoveZerosToEnd.moveZerosToEnd(input));
    }
}
