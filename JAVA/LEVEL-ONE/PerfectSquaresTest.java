import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PerfectSquaresTest {

    @Test
    public void shouldReturnPerfectSquaresFromMixedArray() {
        int[] input = {4, 7, 9, 10, 16, 18};
        int[] expected = {4, 9, 16};

        assertArrayEquals(expected, PerfectSquares.getPerfectSquares(input));
    }

    @Test
   public void shouldReturnEmptyArrayWhenNoPerfectSquares() {
        int[] input = {2, 3, 5, 6, 7};
        int[] expected = {};

        assertArrayEquals(expected, PerfectSquares.getPerfectSquares(input));
    }

    @Test
   public void shouldHandleZeroAndOne() {
        int[] input = {0, 1, 2, 3, 4};
        int[] expected = {0, 1, 4};

        assertArrayEquals(expected, PerfectSquares.getPerfectSquares(input));
    }

    @Test
   public void shouldReturnAllWhenAllArePerfectSquares() {
        int[] input = {1, 4, 9, 16, 25};
        int[] expected = {1, 4, 9, 16, 25};

        assertArrayEquals(expected, PerfectSquares.getPerfectSquares(input));
    }

   
}
