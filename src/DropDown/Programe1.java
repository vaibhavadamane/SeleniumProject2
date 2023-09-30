package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe1 {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	    Select s = new Select(dropdown);
	    s.selectByIndex(5);
	   List<WebElement> options = s.getOptions();
	   for(int i=0;i<options.size();i++)
	   {
		   System.out.println(options.get(i).getText());
	   } 
	    Thread.sleep(5000);
	    driver.close();
	    
	}
	

}
