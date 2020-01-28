import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CeaserCipherTest {
    // check if the class can be an instance of an empty array
        @Test
        public void  canCreate_InstatiatesCorrectly() throws Exception{
            CeaserCipher testCeaserCipher = new CeaserCipher("A",1);
            assertEquals(true,testCeaserCipher instanceof CeaserCipher);
        }
        //check if it can be an instance of a string;
        @Test
    public void newCipher_InstanceOfString() throws Exception{
            CeaserCipher testCeaserCipher = new CeaserCipher("A",1);
            assertEquals(true,testCeaserCipher instanceof CeaserCipher);
        }
        @Test
    public void checkFor_AnInstanceOfAn_integer()throws Exception{
            CeaserCipher testCeaserCpher = new CeaserCipher("A",1);
            assertEquals(true,testCeaserCpher instanceof CeaserCipher );
        }
        // when given a key and a word it should return a string that is ++key in the alphabet;
        @Test
    public void checkFor_encription_GivenTheWord_And_aKey() throws Exception{
            CeaserCipher testCeaserCipher = new CeaserCipher("A",1);
            assertEquals("B",testCeaserCipher.cipheredWord());

        }
        // when given a string with more than one more than one characters e.g ABCEDE
        @Test
    public  void check_encription_ofMorethanOneString()throws Exception{
            CeaserCipher testCeaserCipher = new CeaserCipher("AB",1);
            assertEquals("BC",testCeaserCipher.cipheredWord());
        }
        // when supplied with a String that is of lowercase
       @Test
    public void check_Encription_of_SmallCaseLetters()throws Exception{
            CeaserCipher testCeaserCipher = new CeaserCipher("ab",1);
            assertEquals("bc",testCeaserCipher.cipheredWord());
       }

}
