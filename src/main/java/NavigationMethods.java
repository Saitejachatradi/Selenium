import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.findElement(By.className("gLFyf")).sendKeys("Cricbuzz");
        driver.findElement(By.name("q")).submit();
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.quit();
    }
}
