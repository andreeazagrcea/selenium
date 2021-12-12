import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wishlisttest {

     public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","resources/chromedriver");
         WebDriver driver=new ChromeDriver();
         driver.get("http://testfasttrackit.info/selenium-test");
         driver.findElement(By.cssSelector(body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > ul > li:nth-child(1));






    }
}
