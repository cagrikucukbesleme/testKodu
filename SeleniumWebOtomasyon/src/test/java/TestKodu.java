import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class TestKodu {
 @Test
    public void webSitesiTesti () {

     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();

     driver.navigate().to("https://www.gittigidiyor.com/");
     driver.get("https://www.gittigidiyor.com/");

     driver.navigate().to("https://www.gittigidiyor.com/uye-girisi");
     WebElement search;
     driver.findElement(By.name("text")).sendKeys("bilgisayar");


     driver.navigate().to("https://www.gittigidiyor.com/sepetim");



  driver.close();
 }

}
