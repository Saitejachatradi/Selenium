import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicControls {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        Thread.sleep(2000);
        driver.findElement(By.id("femalerb")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("englishchbx")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hindichbx")).click();
        WebElement chk = driver.findElement(By.id("chinesechbx"));
        chk.click(); //chk
        Thread.sleep(2000);
        if(chk.isSelected()){
            chk.click(); //uncheck
        }
        driver.findElement(By.id("registerbtn")).click();
        System.out.println(driver.findElement(By.id("msg")).getText());
        Thread.sleep(3000);
        driver.findElement(By.linkText("Click here to navigate to the home page"));



    }
}
