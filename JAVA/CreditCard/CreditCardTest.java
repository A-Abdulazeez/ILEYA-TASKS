import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    public void testOfCardTypeReturnsVisa() {
        String result = CreditCard.ofCardType("4388576018410707");
        assertEquals("Visa Card", result);
    }

    @Test
    public void testOfCardTypeReturnsMasterCard() {
        String result = CreditCard.ofCardType("5388576018410707");
        assertEquals("MasterCard", result);
    }


    @Test
    public void testValidLengthReturnsTrueFor16Digits() {
        assertTrue(CreditCard.validLength("4388576018410707"));
    }

    @Test
    public void testValidLengthReturnsFalseFor12Digits() {
        assertFalse(CreditCard.validLength("123456789012"));
    }


    @Test
    public void testSumOfDoubleEvenPlacesForValidCard() {
        int result = CreditCard.sumOfDoubleEvenPlaces("4388576018410707");
        assertEquals(29, result);
    }

    @Test
    public void testSumOfDoubleEvenPlacesForInvalidCard() {
        int result = CreditCard.sumOfDoubleEvenPlaces("4388576018402626");
        assertEquals(37, result);
    }


    @Test
    public void testSumOfOddPlacesForValidCard() {
        int result = CreditCard.sumOfOddPlaces("4388576018410707");
        assertEquals(41, result);
    }

    @Test
    public void testSumOfOddPlacesForInvalidCard() {
        int result = CreditCard.sumOfOddPlaces("4388576018402626");
        assertEquals(38, result);
    }


    @Test
    public void testIsValidReturnsTrue() {
        assertTrue(CreditCard.isValid("4388576018410707"));
    }

    @Test
    public void testIsValidReturnsFalse() {
        assertFalse(CreditCard.isValid("4388576018402626"));
    }
}