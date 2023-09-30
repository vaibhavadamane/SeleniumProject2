package Demo;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe2 {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.irctc.co.in/nget/train-search/");
//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		driver.manage().window().maximize();
		
//		WebElement allclass = driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']"));
//		allclass.click();
//		Actions a = new Actions(driver);
//		a.moveToElement(allclass).click().build().perform();
//		for(int i=0;i<5;i++)
//		{
//			a.sendKeys(Keys.DOWN).build().perform();
//		}
//		Thread.sleep(5000);
//		a.sendKeys(Keys.ENTER).build().perform();
		
		String title = driver.getTitle();
		System.out.println("Title of the Webpage = " + title);
		String url = driver.getCurrentUrl();
		System.out.println("Url of the Webpage = " + url);
	    
//		WebElement dropdown = driver.findElement(By.xpath("//select"));
//		Select s = new Select(dropdown);
////		s.selectByVisibleText("Argentina");
//		s.selectByValue("MNG");
////		s.selectByIndex(5);\
//		List<WebElement> options = s.getOptions();
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText() + " ");
//		}
		
		WebElement multiselect = driver.findElement(By.xpath("(//select[@class='select select-initialized'])[1]"));
		Select s = new Select(multiselect);
		s.selectByVisibleText("Four");
		Thread.sleep(3000);
		s.selectByIndex(2);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.close();
	}
	}
	


