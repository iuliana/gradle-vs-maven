import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuliana Cosmina on 2/8/18
 */
public class GrandChild0202Test {

    @Test
    public void test(){
        GrandChild0202 gc = new GrandChild0202("Sample");
        Assert.assertEquals("ple", gc.getName());
    }
}
