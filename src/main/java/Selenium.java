import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Selenium {

    public static void main(String[] args) throws InterruptedException {

        // Setup WebDriverManager and ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions());

        try {
            // Navigate to the login page
            driver.get("https://github.com/login");

            // Wait for and highlight the elements
            highlight(driver, driver.findElement(By.id("login_field")));
            Thread.sleep(3000);  // Pause for 3 seconds

            highlight(driver, driver.findElement(By.name("password")));
            Thread.sleep(3000);  // Pause for 3 seconds

            highlight(driver, driver.findElement(By.className("header-logo")));
            Thread.sleep(3000);  // Pause for 3 seconds

            highlight(driver, driver.findElement(By.linkText("Forgot password?")));
            Thread.sleep(3000);  // Pause for 3 seconds

            highlight(driver, driver.findElement(By.partialLinkText("Create an")));
            Thread.sleep(3000);  // Pause for 3 seconds

            highlight(driver, driver.findElement(By.tagName("h1")));
            Thread.sleep(3000);  // Pause for 3 seconds

            highlight(driver, driver.findElement(By.cssSelector("input[name = 'commit']")));

        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Ensure the WebDriver quits after execution
            driver.quit();
        }
    }

    public static void highlight(WebDriver driver, WebElement element) {
        try {
            // Using WebDriverWait to ensure the element is visible before interaction
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));

            // Highlighting the element with a red border and yellow background
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;')", element);

        } catch (Exception e) {
            System.out.println("Error highlighting element: " + e.getMessage());
        }
    }
}
