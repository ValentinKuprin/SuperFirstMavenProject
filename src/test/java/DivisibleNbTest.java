import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisibleNbTest {

    @Test
    public void testDivisibleNb(){

    Assert.assertTrue(DivisibleNb.isDivisibleNb(3, 1, 3));

}
}
