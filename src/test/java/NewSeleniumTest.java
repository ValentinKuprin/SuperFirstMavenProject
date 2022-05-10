import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewSeleniumTest {


    public class HelloSelenium {

    }
    @Test
    public void Test() {
            System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();

            driver.get("https://ru.duolingo.com/");

           // driver.getTitle(); // => "Google"

        String title = driver.getTitle();
        Assert.assertEquals(title, "Duolingo - Лучший в мире способ учить языки");

        driver.findElement(By.xpath("//a[@class='WOZnx _275sd _1ZefG _3mSsk _32wa0")).click();














           // Assert.assertEquals(driver.getTitle(), "Duolingo - Лучший в мире способ учить языки");
//
           // WebElement searchBox = driver.findElement(By.className("widget-slide-button"));
           // WebElement searchButton = driver.findElement(By.name("btnK"));
//
           // searchBox.sendKeys("Selenium");
           // searchButton.click();
//
           // searchBox = driver.findElement(By.name("q"));
           // searchBox.getAttribute("value"); // => "Selenium"

            driver.quit();
        }
    }
