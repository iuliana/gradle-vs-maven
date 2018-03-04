import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuliana Cosmina on 2/8/18
 */
public class Child01Test {

    @Test
    public void test(){
        Child01 gc = new Child01("sample");
        Assert.assertEquals("SAMPLE", gc.getName());
    }
}
