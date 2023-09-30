package MultipalWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandaleultipalElement2 {

	public static void main(String[] args) throws Exception 
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.apple.com/in/store");	

    List<WebElement> images = driver.findElements(By.xpath("//img"));
    System.out.println("No of Images " + images.size());
    
    for(WebElement value : images)
    {
    	System.out.println(value.getText());
    }
    
    for(int i=0;i<images.size();i++)
    {
    	
    }
	
	Thread.sleep(5000);
	driver.close();
	}

}
