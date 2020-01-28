import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main (String[]args) {
        BufferedReader userWordReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader userKeyReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("********************************");
        System.out.println("Welcome to CAESER CIPHER");
        System.out.println("*********************************");
        System.out.println("Enter Your Word to get the Caeser Cipher for that word");
        try {
            String userWord = userWordReader.readLine();
            System.out.println("Enter the number of Shifts you would like to be made");
            String  userKey = userKeyReader.readLine();
            int intUserKey = Integer.parseInt(userKey);
            CeaserCipher ceaserCipher = new CeaserCipher(userWord,intUserKey);
            String ceaserOutPut = ceaserCipher.cipheredWord();
            System.out.println("Your Ceaser Cypher is " + ceaserOutPut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
