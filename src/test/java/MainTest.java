import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void  testAbbr4() {
        String result = Main.abbr("Sergey", 4);

        Assert.assertEquals(result, "S...");
    }

        @Test
        public void  testAbbr8() {
            String result = Main.abbr("Hello world", 8);

            Assert.assertEquals(result, "Hello...");


        }

}
