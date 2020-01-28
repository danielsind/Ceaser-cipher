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
        @Test
    public void checkFor_encription_GivenTheWord_And_aKey() throws Exception{
            CeaserCipher testCeaserCipher = new CeaserCipher("A",1);
            assertEquals("B",testCeaserCipher.cipher());
        }
}
