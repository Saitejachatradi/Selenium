import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropDowns {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);
//        WebElement element =driver.findElement(By.id("course"));
//        Select courseelement = new Select(element);
//        List<WebElement> elementList =courseelement.getOptions();
//        for(WebElement element1:elementList){
//            System.out.println(element1.getText());
//        }
//        courseelement.selectByIndex(1);
//        Thread.sleep(3000);
//        courseelement.selectByValue("js");
//        Thread.sleep(3000);
//        courseelement.selectByVisibleText("Python");
//        String selectedText = courseelement.getFirstSelectedOption().getText();
//        System.out.println("Selected Text is " +selectedText);

        WebElement element = driver.findElement(By.id("ide"));
        Select multielement = new Select(element);
        List<WebElement> elementList = multielement.getOptions();
        for(WebElement element1: elementList){
            System.out.println(element1.getText());
        }
        Thread.sleep(3000);
        multielement.selectByValue("ec");
        Thread.sleep(3000);
        multielement.selectByVisibleText("IntelliJ IDEA");
        Thread.sleep(3000);
        multielement.selectByIndex(3);
        Thread.sleep(3000);
        multielement.deselectByValue("ec");
        List<WebElement> multiselectText = multielement.getAllSelectedOptions();
        for(WebElement webElement : multiselectText){
            System.out.println("Selected "+webElement.getText());
        }
    }
}
