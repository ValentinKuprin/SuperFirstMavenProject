import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainTest {

    @Test
    public void testFirstSelenium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe"); // Адрес к вэбДрайверу
        WebDriver driver = new ChromeDriver(); //Создаем хромдрайвер, типа(new ChromeDriver() а сохраняем в переменную типа вэбДрайвер - (это или родительский клас по отношению к хромДрайверу или некоторый интерфейс )

        driver.get("https://google.com"); // переход на страницу по адресу

        System.out.println(driver.getTitle()); // => "Google" прочитать тайтл

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MICROSECONDS);//

        WebElement searchBox = driver.findElement(By.name("q")); //By. можно использовать поиск по имени, по айди, тэг нэйм, цсс селектор, класс нэйм, хпас, линк текст
//Обращаемся к драйверу и вызываем findElement, он ищет какой-то элемент на странице (By.(name атрибут)= "q" <- значение/тэги сохраняем в переменную searchBox типа WebElement
//searchBox - поисковая строка
        WebElement searchButton = driver.findElement(By.name("btnK"));



        searchBox.sendKeys("Selenium");
        // переменная searchBox хранит элемент ввода, вызываем метод sendKeys - печатаем внутри элемента searchBox слово "Selenium"
        Thread.sleep(1000); // задержка
        searchButton.click();
        // переменной searchButton говорим нажать на кнопку "findElement(By.name("btnK")"

        searchBox = driver.findElement(By.name("q"));
        // ищем атрибут "q" на странице
        //searchBox.getAttribute("value"); // => "Selenium"
        // проверяем что находится в находится в searchBox если "Selenium" то true
        Assert.assertEquals(searchBox.getAttribute("value"), "Selenium");

        driver.quit();


        }

}
