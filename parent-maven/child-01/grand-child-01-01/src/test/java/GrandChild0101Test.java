import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuliana Cosmina on 2/8/18
 */
public class GrandChild0101Test {

    @Test
    public void test(){
        GrandChild0101 gc = new GrandChild0101("sample");
        Assert.assertEquals("SAMPLE", gc.getName());
    }
}
