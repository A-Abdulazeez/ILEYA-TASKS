import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromicArrayTest {

    @Test
    public void testForPalindromicArrayReturnTrue() {
        int[] input = {45, 0, 8, 0, 45};
        assertTrue(PalindromicArray.isPalindromic(input));
    }

    @Test
    void testNonPalindromicArrayReturnFalse() {
        int[] input = {1, 2, 3, 4};
        assertFalse(PalindromicArray.isPalindromic(input));
    }

  
}
