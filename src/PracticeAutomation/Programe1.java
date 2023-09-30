package PracticeAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe1
{
public static void main(String[] args) throws Exception 
{

	WebDriverManager.chromedriver().setup();
	ChromeOptions o = new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(o);
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.alertIsPresent());
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
//	Handle the Helthcare module functionlity
	WebElement helthcare = driver.findElement(By.xpath("//i[@class='icon-bg homeIconsBg health-insurance']"));
	helthcare.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Thread.sleep(5000);
	driver.close();

	
}
}
