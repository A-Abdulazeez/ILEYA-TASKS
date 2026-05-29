import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

   @Test
    void testToEncryptHEllo() {
        assertEquals("Khoor", CaesarCipher.encrypt("Hello", 3));
    }

     @Test
    void testToEncryptHElloWorld() {
        assertEquals("Khoor, Zruog!", CaesarCipher.encrypt("Hello, World!", 3));
    }

    @Test
    void testToDecryptHEllo() {
        assertEquals("Hello", CaesarCipher.decrypt("Khoor", 3));
    }

     @Test
    void testToDecryptHElloWorld() {
        assertEquals("Khoor, Zruog!", CaesarCipher.encrypt("Hello, World!", 3));
    }
}