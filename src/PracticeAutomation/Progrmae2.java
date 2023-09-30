package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Progrmae2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		WebElement logo = driver.findElement(By.xpath("//img[@alt='orangehrm-logo']"));
		System.out.print("URL of the Application = " + url + " " + "\nTitle of the Application = " + title );
		boolean result = logo.isDisplayed();
		System.out.println("\nLogo is displyed or not = " + result);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		

		
		
		
		
		
		
//		Thread.sleep(5000);
//		
//		driver.close();
		
		
	}

}
