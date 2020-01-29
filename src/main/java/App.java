import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main (String[]args) {
        BufferedReader userWordReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader userKeyReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader userChoice = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("********************************");
        System.out.println("Welcome to CAESER CIPHER");
        System.out.println("*********************************");
        try {
            System.out.println("Enter your Word");
            String userWord = userWordReader.readLine();
            System.out.println("Enter the number of Shifts you would like to be made");
            String  userKey = userKeyReader.readLine();
            int intUserKey = Integer.parseInt(userKey);
            CeaserCipher ceaserCipher = new CeaserCipher(userWord,intUserKey);
            String ceaserOutPut = ceaserCipher.cipheredWord();
            System.out.println("Your Ceaser Cypher is " + ceaserOutPut);
            System.out.println("Enter your Word to Decipher");
            String userdWord = userWordReader.readLine();
            System.out.println("Enter the number of Shifts you would like to be made");
            String  userdKey = userKeyReader.readLine();
            int intUserdKey = Integer.parseInt(userdKey);
            CeaserDecipher ceaserDecipher = new CeaserDecipher(userdWord,intUserdKey);
            String ceaserdOutPut = ceaserDecipher.decipheredWord();
            System.out.println("Your Ceaser Decipher is " + ceaserdOutPut);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
