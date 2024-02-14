package SeleniumCl2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locator2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anjvihija");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("nvajnvjn");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("n info")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("kmcbiajsdhci");
        Thread.sleep(3000);
        driver.findElement(By.className("customer.address.zipCode")).sendKeys("258963");
        Thread.sleep(3000);

        List<WebElement> webElements =driver.findElements(By.tagName("a"));
        for (WebElement webElement : webElements) {
            System.out.println(webElement.getText() + " " +webElement.getAttribute("href"));
        }

        driver.quit();
    }
}
