import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CeaserDecipherTest {
    @Test
    public void canCreateAnInstanceOF_StringAndINteger()throws  Exception{
        CeaserDecipher testDecipher = new CeaserDecipher("A",1);
        assertEquals(true,testDecipher instanceof CeaserDecipher );
    }
    @Test
    public void canGetWord_andKey()throws Exception{
        CeaserDecipher testDecipher = new CeaserDecipher("A",1);
        assertEquals("A",testDecipher.getWord());
        assertEquals(1,testDecipher.getKey());
    }
    @Test
    public void checkForDecipherMethod(){
        CeaserDecipher testDecipher = new CeaserDecipher("B",1);
        assertEquals("A",testDecipher.decipheredWord());
    }
    @Test
    public void checkDecipherForSmallCase(){
        CeaserDecipher testDecipher = new CeaserDecipher("d",1);
        assertEquals("c",testDecipher.decipheredWord());
    }
    @Test
    public void checkForSpace(){
        CeaserDecipher testDecipher = new CeaserDecipher("BC BC",1);
        assertEquals("AB AB",testDecipher.decipheredWord());
    }
}
