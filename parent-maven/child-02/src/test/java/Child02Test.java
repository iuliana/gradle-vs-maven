import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuliana Cosmina on 2/8/18
 */
public class Child02Test {

    @Test
    public void test(){
        Child02 gc = new Child02("Sample");
        Assert.assertEquals("Sam", gc.getName());
    }
}
