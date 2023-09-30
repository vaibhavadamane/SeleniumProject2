package Demo;

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

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe3 {

	static WebDriver driver;
	public static void screenshot() throws Exception
	{
		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot2/Photo1.jpeg");
	    FileHandler.copy(image, file);
//	    FileUtils.copyFile(image, file);
	}
	
	public static void elementshot() throws Exception
	{
		WebElement watch = driver.findElement(By.xpath("//div[@data-unit-id='apple-watch-ultra']"));
		File applewatch = watch.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Screenshot2/Photo2.jpeg");
		FileUtils.copyFile(applewatch,file);
	}
	
	public static void fullpage() throws Exception
	{
		Date d = new Date();
		String date = d.toString();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.apple.com/in/apple-watch-ultra/");
        driver.manage().window().maximize();
		Thread.sleep(10000);
		File image = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot2/Photo" + date + "jpeg");
		FileUtils.copyFile(image, file);
	}
	
	public static void main(String[] args) throws Exception
	{
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.apple.com/in/");
//		Thread.sleep(5000);
//		screenshot();
//		elementshot();
		fullpage();
		Thread.sleep(3000);
		driver.close();

	}

}
