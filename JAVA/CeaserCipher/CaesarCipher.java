public class CaesarCipher {

    public static String encrypt(String userInput, int shift) {
        shift = ((shift % 26) + 26) % 26;

        StringBuilder encryptedText = new StringBuilder();

        for (char currentCharacter : userInput.toCharArray()) {
            if (Character.isUpperCase(currentCharacter)) {
                encryptedText.append(
                    (char) ((currentCharacter - 'A' + shift) % 26 + 'A')
                );
            } else if (Character.isLowerCase(currentCharacter)) {
                encryptedText.append(
                    (char) ((currentCharacter - 'a' + shift) % 26 + 'a')
                );
            } else {
                encryptedText.append(currentCharacter);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String userInput, int shift) {
        return encrypt(userInput, 26 - ((shift % 26) + 26) % 26);
    }
}