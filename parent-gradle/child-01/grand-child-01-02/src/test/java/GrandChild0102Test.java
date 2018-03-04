import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuliana Cosmina on 2/8/18
 */
public class GrandChild0102Test {

    @Test
    public void test(){
        GrandChild0102 gc = new GrandChild0102("SAMPLE");
        Assert.assertEquals("sample", gc.getName());
    }
}
