package Scrrenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrrenshotPograme3 {
	
	static  WebDriver driver;

	//Date and Time
	public static String dateAndTime() 
	{
		Date d = new Date();
		return d.toString();
	}
	
	//Take a Current page screenshot
	public static void takeScreenshots1() throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo11.jpeg");
	//	FileHandler.copy(source, dest);
	    FileUtils.copyFile(source, dest);
	}
	
	//Take a particular module Screenshots
	public static void takesceenshot2() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.apple.com/in/shop/buy-iphone/iphone-14-pro");
		WebElement iPhone = driver.findElement(By.xpath("//img[@width='2560']"));
		File sourse = iPhone.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Screenshot/Photo12.jpeg");
		FileHandler.copy(sourse, dest);
		
	}
	//Take Full Screenshot
	public static void takeScreenshot3() throws Exception 
	{
	//	WebDriverManager.firefoxdriver().setup();
		String date = dateAndTime();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.get("https://www.apple.com/in/shop/buy-iphone");
		File sourse = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo "+date+" .jpeg");
		FileHandler.copy(sourse, dest);
	}
		
	public static void main(String[] args) throws Exception 
	{
//		WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//		driver.get("https://www.apple.com/in/store");
//		takeScreenshots1();
//		Thread.sleep(5000);
//		driver.close();
		
//		takesceenshot2();
		takeScreenshot3();
		Thread.sleep(5000);
		driver.quit();
	}

}
