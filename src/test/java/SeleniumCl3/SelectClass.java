package SeleniumCl3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(1000);

        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByIndex(2);
        Thread.sleep(1000);
        select.selectByValue("ALBANIA");
        Thread.sleep(1000);
        select.selectByVisibleText("ARGENTINA");
        Thread.sleep(1000);

        for (WebElement webElement : select.getOptions()) {
            System.out.println(webElement.getText());
        }


        driver.quit();
    }
}
