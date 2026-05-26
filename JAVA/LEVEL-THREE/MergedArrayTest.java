import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergedArrayTest {

    @Test
    public void testThatTwoArraywillMerge() {
        int[] numbers = {3, 2, 1, 4};
	int [] number = {1,2,3,4};
	int [] expected = {1, 1, 2, 2, 3, 3, 4, 4};
        assertArrayEquals(expected, MergedArray.mergedArrayOf(numbers,number));
    }
 @Test
    public void testThatTwoArrayWithZeroswillMerge() {
        int[] numbers = {0,0,0};
	int [] number = {0,0,0};
	int [] expected = {0,0,0,0,0,0};
        assertArrayEquals(expected, MergedArray.mergedArrayOf(numbers,number));
    }
}
