import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {

    private final CaesarCipher cipher = new CaesarCipher();
    @Test
    void emptyMessageTest(){
        assertEquals("", cipher.encrypt("", 3));
    }

    @Test
    void messageTest(){
         //TODO

    }
}

