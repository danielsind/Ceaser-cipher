import java.io.BufferedReader;
import java.io.InputStreamReader;
public class App {
    public static void main (String[]args){
        BufferedReader userWordReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("********************************");
        System.out.println("Welcome to CAESER CIPHER");
        System.out.println("*********************************");
        System.out.println("Enter Your Word to get the Caeser Cipher for that word");
    }
    try{
        String userWord = userWordReader.readLine();
    }

}
