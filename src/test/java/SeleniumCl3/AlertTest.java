package SeleniumCl3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(1000);

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Hello world");
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(1000);

        driver.quit();
    }
}
