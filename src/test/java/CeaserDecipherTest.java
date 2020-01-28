import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CeaserDecipherTest {
    @Test
    public void canCreateAnInstanceOF_StringAndINteger()throws  Exception{
        CeaserDecipher testDecipher = new CeaserDecipher("A",1);
        assertEquals(true,testDecipher instanceof CeaserDecipher );
    }
}
