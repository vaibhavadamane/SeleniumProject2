package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2
{
public static void main(String[] args) 
{
      WebDriverManager.firefoxdriver().setup();
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.infosys.com/");
      driver.manage().window().maximize();
//      WebElement lebel = driver.findElement(By.xpath("//a[@aria-label='Amazon.in']"));
      driver.quit();
     
}
}
