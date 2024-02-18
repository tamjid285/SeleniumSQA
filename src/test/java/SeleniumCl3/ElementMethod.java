package SeleniumCl3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(3000);

        driver.findElement(By.id("firstName")).sendKeys("Tamjid");

        WebElement webElement = driver.findElement(By.id("lastName"));
        Thread.sleep(3000);
        webElement.sendKeys("islam");
        Thread.sleep(3000);
        webElement.clear();
        Thread.sleep(3000);
        webElement.sendKeys("Bin");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("label[for=gender-radio-1]")).click();
        Thread.sleep(3000);

        WebElement checkBox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        System.out.println(checkBox.isDisplayed());
        checkBox.click();
        Thread.sleep(2000);

        System.out.println(checkBox.isSelected());
        System.out.println("getTagName : "+checkBox.getTagName());
        System.out.println("getTagName : "+checkBox.getRect().height);
        System.out.println("font-family : "+checkBox.getCssValue("font-family"));
        System.out.println("getText : "+checkBox.getText());

        driver.quit();

    }
}
