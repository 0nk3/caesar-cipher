import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {

    private static final int ALPHABET_SIZE = 26;
    private static final List<Character> lowerCase = new ArrayList<>();

    /**
     * generate a list containing alphabets a -z
     */
    public void generateAlphabets(){
        for(int i = 97; i <= 122; i++){
            lowerCase.add(((char)i));
        }
    }

    /**
     * display encrypted caesar ciper to console
     * @param message that must be encrypted
     * @param shift to be user for the caesar Cipher
     * @return
     */
    public String encrypt(String message, int shift){
        char[] lowerCase = message.toLowerCase().toCharArray();
        StringBuilder text = new StringBuilder();
        int position ;
        for (char l : lowerCase){
            if(l==' '){
                text.append(' ');
            }else {
                position = (CaesarCipher.lowerCase.indexOf(l) + shift) % ALPHABET_SIZE;
                text.append(CaesarCipher.lowerCase.get(position));
            }
        }
        String t = text.toString();
        return t;
    }
}
