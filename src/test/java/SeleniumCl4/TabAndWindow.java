package SeleniumCl4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabAndWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.findElement(By.className("main-header")).getText());

        Thread.sleep(3000);

        String originalWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");
        Thread.sleep(2000);
        System.out.println("New Window : " + driver.findElement(By.id("sampleHeading")).getText());
        driver.close();
        driver.switchTo().window(originalWindow);
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.className("main-header")).getText());


        Thread.sleep(3000);
        driver.quit();

    }
}
