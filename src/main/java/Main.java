import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        Scanner keyboard = new Scanner(System.in);
        String message;
        int shift = 0;
        do {
            // get user input
            System.out.println("Enter message : ");
            message = keyboard.nextLine();
            if(message.equals("exit")) {
                System.err.println("Bye!");
                break;
            }
            System.out.println("Enter shifting value : ");
            shift = keyboard.nextInt();
            // generate alphabets
            caesarCipher.generateAlphabets();

            // spit out output to console
            System.out.print("Cipher Message : ");
            System.out.println(caesarCipher.encrypt(message, shift));

            keyboard.nextLine();
            System.out.println("<=======================================================>");
        }while (true);
    }
}

