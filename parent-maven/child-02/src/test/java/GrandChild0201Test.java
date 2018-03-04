import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuliana Cosmina on 2/8/18
 */
public class GrandChild0201Test {

    @Test
    public void test(){
        GrandChild0201 gc = new GrandChild0201("Sample");
        Assert.assertEquals("Sam", gc.getName());
    }
}
