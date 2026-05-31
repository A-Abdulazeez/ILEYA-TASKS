public class CreditCard {

    public static String ofCardType(String cardDetails) {

        String cardType = "";

        if (cardDetails.startsWith("4")) {
            cardType = "Visa Card";
        }
        else if (cardDetails.startsWith("5")) {
            cardType = "MasterCard";
        }
        else if (cardDetails.startsWith("37")) {
            cardType = "American Express Card";
        }
        else if (cardDetails.startsWith("6")) {
            cardType = "Discover Card";
        }
        else {
            cardType = "Invalid Card Type";
        }

        return cardType;
    }

public static boolean validLength(String cardNumber) {
        return cardNumber.length() >= 13 && cardNumber.length() <= 16;
    }

    public static int sumOfDoubleEvenPlaces(String cardNumber) {
        int sum = 0;

        for (int index = cardNumber.length() - 2; index >= 0; index -= 2) {
            int digit = Character.getNumericValue(cardNumber.charAt(index));

            digit *= 2;

            if (digit > 9) {
                digit = digit / 10 + digit % 10;
            }

            sum += digit;
        }

        return sum;
    }

    public static int sumOfOddPlaces(String cardNumber) {
        int sum = 0;

        for (int index = cardNumber.length() - 1; index >= 0; index -= 2) {
            sum += Character.getNumericValue(cardNumber.charAt(index));
        }

        return sum;
    }

    public static boolean isValid(String cardNumber) {
        int total = sumOfDoubleEvenPlaces(cardNumber) + sumOfOddPlaces(cardNumber);

        return total % 10 == 0;
    }

    public static void main(String... args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter card number: ");
        String cardNumber = input.nextLine();

        System.out.println("Credit Card Type: " + CreditCard.ofCardType(cardNumber));

        System.out.println("Credit Card Number: " + cardNumber);

        System.out.println("Credit Card Digit Length: " + cardNumber.length());

        if (CreditCard.validLength(cardNumber) && CreditCard.isValid(cardNumber)) {

            System.out.println("Credit Card Validity Status: Valid");
        }
        else {
            System.out.println("Credit Card Validity Status: Invalid");
        }
    }
}