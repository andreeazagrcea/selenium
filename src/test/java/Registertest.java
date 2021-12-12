import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Registertest {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a"));
        




    }
}
