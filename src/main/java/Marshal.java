import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Marshal {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      // driver.get("https://google.com");

      // WebElement input = driver.findElement(By.id("input"));
      // input.click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // WebElement element = (new WebDriverWait(driver, Duration.ofSeconds())).until(Expre);
        driver.get("https://www.avito.ru/");

        WebElement element1 = driver.findElement(By.xpath("(//a[text() ='Личные вещи'])"));
        String par = element1.getAttribute("offsetWidth");
        System.out.println(par);




    }
}
